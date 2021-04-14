/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.xjtlu.cpt102.ttl;

/**
 *
 * @author Ting.Cao
 */
public class IntArrayBagTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntArrayBag firstBag = new IntArrayBag();
        
        firstBag.addMany(1,2,3,4,5,6,7);
        System.out.println("There are : "+firstBag.size() + " item(s) in the first bag");
       
        IntArrayBag secondBag = new IntArrayBag();
        int[] nums = {3,3,4,5,6,7,8,9};
        secondBag.addMany(nums);
        System.out.println("There are : "+secondBag.size() + " item(s) in the second bag");
        
        firstBag.addAll(secondBag);
        firstBag.addAll(firstBag);
        firstBag.addAll(firstBag);
        System.out.println("There are : "+firstBag.size() + " item(s) in the first bag");
        
        System.out.println(firstBag.countOccurrences(3));
        
 
        IntArrayBag part1 = new IntArrayBag();
        part1.addMany(1,2,2);
        System.out.println("There are : "+part1.size() + " item(s) in the part 1 bag");

        IntArrayBag part2 = new IntArrayBag();
        part2.addMany(2,2,2,3,4);
        System.out.println("There are : "+part2.size() + " item(s) in the part 2 bag");

        IntArrayBag unionBag = IntArrayBag.union(part1, part2);
        IntArrayBag intersectionBag = IntArrayBag.intersection(part1, part2);
        System.out.println("There are : "+unionBag.size() + " item(s) in the unionBag");
        System.out.println("There are : "+intersectionBag.size() + " item(s) in the intersectionBag");
        
        
    }
    
}
