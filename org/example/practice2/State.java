package org.example.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class State {
    public static void main(String[] args) {

        ArrayList<StateCode> sts=new ArrayList<>();
        sts.add(new StateCode("MH","Mumbai"));
        sts.add(new StateCode("GJ","Ahemadhabad"));
        sts.add(new StateCode("Telangana","Adilabad"));
        sts.add(new StateCode("Andra","Amaravathi"));
       getCities(sts);
        System.out.println();
        getCitiesUsingStreams(sts);
    }

    private static void getCities(ArrayList<StateCode> sts) {
        ArrayList<String>cities=new ArrayList<>();
        for(StateCode sc:sts)
        {
            String city=sc.getCity();
            if(city.startsWith("A"))
            {
                cities.add(city.toUpperCase());
            }
            else
                cities.add(city);
        }
        for(String c:cities)
            System.out.print(c+" ");
    }
   /* private static void getCitiesUsingStreams(ArrayList<StateCode> sts) {
        List<String> states=sts.stream().
                filter(name->name.getCity().startsWith("A"))
                .map(city->city.getCity().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(states);
    }*/
}
