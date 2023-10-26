package Ru.Compass.logic;

import java.io.Serializable;
import java.time.temporal.ValueRange;
import java.util.HashMap;
import java.util.Map;

public class CompModel implements Serializable {

    private static final CompModel instance = new CompModel();

    private final Map<Integer, Compas> model;

    public CompModel(){
        model = new HashMap<Integer, Compas>();
    }
    public static CompModel getInstance(){
        return instance;
    }
    public void add(Compas compas,int id){
        model.put(id,compas);
    }

    public Map<Integer,Compas> getAll(){
        return model;
    }
    public String checkDir(String side, int degreeA,int degreeB, int input ){
        ValueRange range = ValueRange.of(degreeA,degreeB);
        if (range.isValidValue(input)){
            return side;
        }else {
            return "not are side ";
        }

    }
}
