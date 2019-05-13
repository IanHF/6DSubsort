public class SubsortThenMerge{
    public ArrayList divideNConquer(ArrayList input){
        if (input.size <= 1){
            return input;
        }else{
            ArrayList firsthalf = new ArrayList;
            int halfSize = input.size()/2;
            for(int i = 0; i < halfSize; i++){
                int x = input.get(i);
                firsthalf.set(i, x);
            }
            ArrayList secondhalf = new ArrayList;
            for(int i = halfSize; i < input.size(); i++){
                int x = input.get(i);
                secondhalf.set(i, x);
            }
            Arraylist a = SubsortThenMerge(firsthalf);
            ArrayList b = SubsortThenMerge(secondhalf);
            return Merge(a,b);
        }
        else{
            break;
        }
    }
}

