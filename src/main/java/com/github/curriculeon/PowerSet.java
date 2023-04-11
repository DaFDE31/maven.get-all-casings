package com.github.curriculeon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    TypeOfSet[] og_set;

    Set<Set<TypeOfSet>> power_set = new HashSet<>();
    //Set<TypeOfSet [] > power_set2 = new HashSet<>();

    public PowerSet(TypeOfSet[] originalSet) {
        /*
        //set = originalSet;
        Set<TypeOfSet> set2 = new HashSet<>();
        for (int one = 0; one <originalSet.length; one++){
            Set<TypeOfSet> partial_set = new HashSet<>();
            partial_set.add(originalSet[one]);
            for (int others = 1; others< originalSet.length; others++){
                if (others == one)
                    continue;
                partial_set.add(originalSet[others]);
            }
            power_set.add(partial_set);
        }

         *///Attempt 1
        int size = 0;
        int start = 0;
        while (size <= originalSet.length){
            //Go through every letter
            Set <TypeOfSet> subset = new HashSet<>();
            for(int i = start; i<size; i++){
                subset.add(originalSet[i]);
            }
            power_set.add(subset);
            start++;
            if (start == originalSet.length-1){// when we get to the last element
                start = 0;
                size++;
            }
        }
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        return power_set;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        Set<TypeOfSet> bob = new HashSet<>();
        //bob.addAll(Arrays.asList(set));
        return null;
    }
}
