package gamemodel;

import java.util.ArrayList;
import java.util.HashMap;


//      *   *   *   *
//    *   *   *   *   *
//  *   *   *   *   *   *
//*   *   *   *   *   *   *
//  *   *   *   *   *   *
//*   *   *   *   *   *   *
//  *   *   *   *   *   *
//*   *   *   *   *   *   *
//  *   *   *   *   *   *
//    *   *   *   *   *
//      *   *   *   *


public class Field {
    private HashMap<Integer, ArrayList<FieldSpace>> rows;

    public Field(FieldSettings settings) {
        init(settings.getFieldLayout());
    }

    public void init(int[][] fieldLayout) {
        if(rows == null){
            rows = new HashMap<>();
        }
        rows.clear();
        int numRows = fieldLayout.length;
        for(int i = 0; i < numRows; i++) {
            ArrayList<FieldSpace> row = new ArrayList<>();
            int numSpaces = fieldLayout[i].length;
            for(int j = 0; j < numSpaces; j++) {
                FieldSpace space = new FieldSpace();
                space.setExists(fieldLayout[i][j] == 1);
                row.add(space);
            }
            rows.put(i, row);
        }
    }
}
