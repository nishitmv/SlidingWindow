package com.nitron.slidingWindow.FruitsInBaskets;

import java.util.HashMap;

public class FruitsIntoBasket {
    public int calc(int[] fruits) {

          if(fruits.length==1)
              return 1;
        if(fruits.length==2)
            return 2;

          int n = fruits.length;
          int i=0;
          int j=0;
          int result =0;

          var map = new HashMap<Integer, Integer>();

          while(j<n)
          {
              int sum =0;
              int key = fruits[j];
              map.computeIfPresent(key, (k, v)-> v+1);
              map.putIfAbsent(key, 1);

              if(map.size()<=2)
              {
                  for(int count: map.values())
                      sum+=count;
                  result = Math.max(result, sum);
              }
              j++;
              while(map.size()>2&& i<n)
              {
                  int keyAtI = fruits[i];

                  if(map.get(keyAtI)>1)
                      map.compute(keyAtI, (k, v)-> v-1);
                  else
                      map.remove(keyAtI);
                  i++;
              }
          }
    return result;
    }
}
