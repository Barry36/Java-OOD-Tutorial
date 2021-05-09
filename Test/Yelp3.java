package Test;

import java.util.*;

public class Yelp3 {

    static int max = 0;

    public class Event{

        String EventType;
        int occur;
        int biz_id;

        public Event(String EventType, int occur, int biz_id){
            this.EventType = EventType;
            this.occur = occur;
            this.biz_id = biz_id;

        }

    }



    public static List<Integer> getInfo(List<Event> list){
        List<Integer> res = new ArrayList<>();

        Map<String, int[]> map = new HashMap<>();

        for(Event e : list)
        {
            if(!map.containsKey(e.EventType))
            {
                map.put(e.EventType, new int[3]);
            }

            int [] A = map.get(e.EventType);
            max = Math.max(max, e.biz_id);

            if(e.occur > 0)
            {
                A[0] += e.occur;
                A[1] += 1;
                A[2] = A[0]/A[1];
            }
        }

        System.out.println(" Average of reviews is " + map.get("page_views")[2]);
        int[] A = new int[max+1];

        for(Event e: list){

            if(e.occur >= map.get(e.EventType)[2]){
                A[e.biz_id]++;
            }
        }


        for(int i = 0; i < A.length; i++){
            if(A[i] >= 2){
                res.add(i);
            }
        }

        return res;

    }


    public static void main(String[] args){

        Yelp3 t = new Yelp3();

        List<Event> list = new ArrayList<>();
        list.add(t.new Event("photo_reviews", 10, 3));
        list.add(t.new Event("ads", 8, 2));
        list.add(t.new Event("ads", 5, 1));
        list.add(t.new Event("page_views", 12, 3));
        list.add(t.new Event("page_views", 11, 2));
        list.add(t.new Event("reviews", 7, 2));


        List<Integer> res = getInfo(list);

        for(int c : res){System.out.print(c + " ");
        }
    }
}