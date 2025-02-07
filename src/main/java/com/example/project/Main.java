package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    /** Inserts toInsert after each String in stringList
    *  that contains the letter "i"
    *
    *  DOES mutate (modify) elements of stringList.
    *  PRECONDITION: stringList.size() > 0, toInsert.length() > 0
    *
    *  @param stringList  original arraylist of Strings
    *  @param str String to insert
    */
    public static ArrayList<String> insertAfterI(ArrayList<String> stringList, String str){
       for(int i = 0; i < stringList.size(); i++){
        if(stringList.get(i).indexOf("i")!=-1){
            stringList.add(i+1,str);
            i++;
        }
       }
        return stringList;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("this", "is", "not", "a", "trivial", "task", "right?"));
        System.out.println(insertAfterI(list, "bob"));

        ArrayList<String> removeList = new ArrayList<String>(Arrays.asList("the", "not", "skim", "pat", "a", "rat", "cat", "sit", "truck", "par", "tar"));
        System.out.println(removeThree(removeList));

        int[] intList = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(reverseArray(intList));

        ArrayList<String> UpperCaselist = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend", "whats", "up"));
        System.out.println(duplicateUpperEnd(UpperCaselist));

        String sentence = "This is a sentence!";
        System.out.println(parseSentence(sentence));
        String sentence2 = "This is another random sentence! It is slightly longer.";
        System.out.println(parseSentence(sentence2));

        ArrayList<String> bshiftedList = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"));
        System.out.println(moveBWords(bshiftedList));

        ArrayList<Integer> removeDuplicates = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 4, 2, 2, 1, 6, 4, 4, 8, 1, 7, 4, 2));
        System.out.println(removeDuplicates(removeDuplicates));

        ArrayList<Integer> sameAsLast1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        System.out.println(sameFirstLast(sameAsLast1));

        ArrayList<Integer> sameAsLast2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1));
        System.out.println(sameFirstLast(sameAsLast2));

        ArrayList<Integer> sameAsLast3 = new ArrayList<Integer>(Arrays.asList(1, 2, 1));
        System.out.println(sameFirstLast(sameAsLast3));

        ArrayList<Integer> sameAsLast4 = new ArrayList<Integer>();
        System.out.println(sameFirstLast(sameAsLast4));

        ArrayList<Integer> swap1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        System.out.println(swapEnds(swap1));

        ArrayList<Integer> swap2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        System.out.println(swapEnds(swap2));

        ArrayList<Integer> swap3 = new ArrayList<Integer>(Arrays.asList(8, 6, 7, 9, 5));
        System.out.println(swapEnds(swap3));

        ArrayList<Integer> swap4 = new ArrayList<Integer>();
        System.out.println(swapEnds(swap4));

        ArrayList<Integer> zerosFirst1 = new ArrayList<Integer>(Arrays.asList(1, 0, 0, 1));
        System.out.println(zeroFront(zerosFirst1));

        ArrayList<Integer> zerosFirst2 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 0, 1));
        System.out.println(zeroFront(zerosFirst2));

        ArrayList<Integer> zerosFirst3 = new ArrayList<Integer>(Arrays.asList(1, 0));
        System.out.println(zeroFront(zerosFirst3));

        ArrayList<Integer> alone1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        System.out.println(notAlone(alone1, 2));

        ArrayList<Integer> alone2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 5, 2));
        System.out.println(notAlone(alone2, 2));

        ArrayList<Integer> alone3 = new ArrayList<Integer>(Arrays.asList(3, 4));
        System.out.println(notAlone(alone3, 3));

        ArrayList<Integer> alone4 = new ArrayList<Integer>(Arrays.asList(4, 3, 4, 4));
        System.out.println(notAlone(alone4, 4));

        ArrayList<Integer> leftshift1 = new ArrayList<Integer>(Arrays.asList(6, 2, 5, 3));
        System.out.println(shiftLeft(leftshift1));

        ArrayList<Integer> leftshift2 = new ArrayList<Integer>(Arrays.asList(1, 2));
        System.out.println(shiftLeft(leftshift2));

        ArrayList<Integer> leftshift3 = new ArrayList<Integer>(Arrays.asList(1));
        System.out.println(shiftLeft(leftshift3));

        ArrayList<Integer> fix1 = new ArrayList<Integer>(Arrays.asList(1, 3, 1, 4));
        System.out.println(fix34(fix1));

        ArrayList<Integer> fix2 = new ArrayList<Integer>(Arrays.asList(1, 3, 1, 4, 4, 3, 1));
        System.out.println(fix34(fix2));

        ArrayList<Integer> fix3 = new ArrayList<Integer>(Arrays.asList(3, 2, 2, 4));
        System.out.println(fix34(fix3));

        int[] intList18 = {1, 2, 3, 2, 4, 5, 5, 6};
        System.out.println(modes(intList18));
        int[] intList19 = {1, 2, 6, 2, 3, 4, 6, 5, 5, 6, 7};
        System.out.println(modes(intList19));
        int[] intList20 = {1, 2, 1, 2, 4, 1, 2, 4, 1, 1, 3};
        System.out.println(modes(intList20));
        int[] intList21 = {1, 2, 3, 4, 3, 2, 1, 4, 1, 2, 3};
        System.out.println(modes(intList21));
        int[] intList22 = {1, 2, 3, 4, 5, 6};
        System.out.println(modes(intList22));
        int[] intList23 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 1, 2, 3, 4, 5, 6};
        System.out.println(modes(intList23));
        int[] intList24 = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6};
        System.out.println(modes(intList24));
        







        



        


    }
    /** Removes all Strings from stringList that have a length of 3
   *
   *  DOES mutate (modify) elements of stringList.
   *  PRECONDITION: stringList.size() > 0
   *
   *  @param stringList  original arraylist of Strings
   */
    public static ArrayList<String> removeThree(ArrayList<String> stringList){
        for(int i = 0; i < stringList.size(); i++){
            if(stringList.get(i).length() == 3){
                stringList.remove(i);
                i--;
            }
        }
        return stringList;
    }
    /** Returns an ArrayList with all elements of arr reversed
   *
   *  Does NOT mutate (modify) elements in intList.
   *  PRECONDITION: intList.size() > 0
   *
   *  @param intList  original array of integers
   */
    public static ArrayList<Integer> reverseArray(int[] intList){
        ArrayList<Integer> reversedIntList = new ArrayList<Integer>();
        for(int i = intList.length -1; i >= 0; i--){
            reversedIntList.add(intList[i]);
        }
        return reversedIntList;
    }
    /** Appends an uppercase version of each string to the end of wordList;
     *  the uppercase versions appear in the same order as the lowercase versions
     *  for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "my", "best", "friend", "HELLO", "MY", "BEST", "FRIEND"]
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITIONS: wordList.size() > 0,
     *                 all words in wordList are initially lowercase
     *
     *  @param wordList  arraylist of Strings
     */
    public static ArrayList<String> duplicateUpperEnd(ArrayList<String> wordList){
        int originalLength = wordList.size();
        String upperCase = "";
        for(int i = 0; i < originalLength; i++){
            upperCase = wordList.get(i).toUpperCase();
            wordList.add(upperCase);
        }
        return wordList;
    }
    /** Returns an arraylist of Strings that represents the input sentence parsed
   *  into separate words, using a single space (" ") as the delimiter
   *
   *  For example, if sentence = "This is my sentence!"
   *  this method return the arraylist: [This, is, my, sentence!]
   *
   *  PRECONDITION: sentence does not end with a space and each word is
   *                separated by exactly one space
   *
   *  @param sentence  the input String
   *  @return  new arraylist of Strings containing the words of sentence
   */
  String sentence = "This is a sentence!";
    public static ArrayList<String> parseSentence(String sentence){
        int index = 0;
        ArrayList<String> parsedArray = new ArrayList<String>();
        for(int i = index; i < sentence.length(); i++){
            // if(sentence.substring(i, i+1).equals(" ")){
            //     count++;
            // }
            if(sentence.substring(i, i + 1).equals(" ")){
                parsedArray.add(sentence.substring(index,i));
                index = i+1;
            }
            if(i == sentence.length() -1){
                parsedArray.add(sentence.substring(index, sentence.length()));
                }
            }
            return parsedArray;
    }
    /** Moves all words in wordList that begin with "b" to the front of
   *  wordList; all "b" words that are moved should appear in the same order
   *  in the modified arrayList as they did before being moved
   *
   *  For example, this method will take a wordList:
   *  ["apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"]
   *  and modify it to
   *  ["banana", "Bagel", "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"]
   *
   *  DOES mutate (modify) elements in wordList
   *  PRECONDITIONS: - wordList.size() > 0
   *                 - all strings in wordList have length >= 1
   *
   *  @param wordList  arraylist of words
   */
    public static ArrayList<String> moveBWords(ArrayList<String> wordList){
        int index = 0;
        for(int i = 0; i < wordList.size(); i++){
            if(wordList.get(i).substring(0, 1).toLowerCase().equals("b")){
                wordList.add(index, wordList.get(i));
                wordList.remove(i+1);
                index++;
                
            }
        }
        return wordList;
    }
    /** Removes all duplicate values from an intList, leaving only the first
     *  occurrence in the arrayList; for example, this method will modify
     *  [1, 2, 5, 4, 2, 2, 1, 6, 4, 4, 8, 1, 7, 4, 2] --> [1, 2, 5, 4, 6, 8, 7]
     *
     *  DOES mutate (modify) elements in intList
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  intList of Integers
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> intList){
        ArrayList<Integer> forbiddenNumbers = new ArrayList<Integer>();
        boolean isFound;
        for(int i = 0; i < intList.size(); i++){
            isFound = false;
            for(int k = 0; k < forbiddenNumbers.size(); k++){
                if(intList.get(i)==forbiddenNumbers.get(k)){
                    intList.remove(i);
                    isFound = true;
                    i--;
                    break;
                }
            }
                if(!isFound){
                    forbiddenNumbers.add(intList.get(i));
                    isFound = false;
                    
            }
        }
        return intList;
    }

    // Given an array of ints, 
    // return true if the array is length 1 or more, 
    // and the first element and the last element are equal.
    // sameFirstLast([1, 2, 3]) → false
    // sameFirstLast([1, 2, 3, 1]) → true
    // sameFirstLast([1, 2, 1]) → true
    //sameFirstLast([]) -> false
    public static boolean sameFirstLast(ArrayList<Integer> list){
        if(list.size() == 0){
            return false;
        }else{
            if(list.get(0) == list.get(list.size()-1)){
                return true;
            }else{
                return false;
            }
        }
    }
    // Given an array of ints, swap the first and last elements in the array. 
    // Return the modified array. The array length will be at least 1.
    // swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    // swapEnds([1, 2, 3]) → [3, 2, 1]
    // swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
    // swapEnds([]->[])
    public static ArrayList<Integer> swapEnds(ArrayList<Integer> list){        
        if(list.size() == 0){
            return list;
        }
        int first = list.get(0);
        int last = list.get(list.size()-1);
        list.remove(0);
        list.remove(list.size()-1);
        list.add(0,last);
        list.add(first);
        return list;
    }



    // Return an array that contains the exact same numbers as the given array, 
    // but rearranged so that all the zeros are grouped at the start of the array. 
    // The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 
    // You may modify and return the given array or make a new array.
    // zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    // zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    // zeroFront([1, 0]) → [0, 1]
    public static ArrayList<Integer> zeroFront(ArrayList<Integer> list){
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 0){
                correctList.add(list.get(i));
            }
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 1){
                correctList.add(list.get(i));
            }
        }
        list = correctList;
        return list;
    }



    // We'll say that an element in an array is "alone" if there are values before and after it, 
    // and those values are different from it. If the value is at the end compare to the left and if its at the beginning compare to the right
    //Return a version of the given array where every instance 
    // of the given value which is alone is replaced by whichever value to its left or right is larger.
    // notAlone([1, 2, 3], 2) → [1, 3, 3]
    // notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 5]
    // notAlone([3, 4], 3) → [3, 3]
    public static ArrayList<Integer> notAlone(ArrayList<Integer> list, int val){
        int before;
        int after;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == val && i == 0 && val < list.get(i+1)){
                list.set(i, list.get(i+1));
            }else if(list.get(i) == val && i == list.size() -1){
                list.set(i, list.get(i-1));
            }else{
                if(list.get(i) == val && i != 0){
                    before = list.get(i-1);
                    after = list.get(i+1);
                    if(after > before){
                        list.set(i, after);
                    }else{
                        list.set(i, before);
                    }
                }
            }
            
        }
        return list;
    }



    // Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
    // You may modify and return the given array;
    // shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    // shiftLeft([1, 2]) → [2, 1]
    // shiftLeft([1]) → [1]

    public static ArrayList<Integer> shiftLeft(ArrayList<Integer> list){
        int first;
        first = list.get(0);
        list.remove(0);
        list.add(first);
        return list;
    }
    


    // Return an array that contains exactly the same numbers as the given array, 
    // but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, 
    // but every other number may move. The array contains the same number of 3's and 4's, 
    // every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
    // fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
    // fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
    // fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
//1, 3, 4, 1, 4, 3, 1
    public static ArrayList<Integer> fix34(ArrayList<Integer> list){
        int change4;
        int swap;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 3){
                
                for(int k = 0; k < list.size(); k++){
                    if(list.get(k) == 4 && list.get(k-1) != 3){
                        change4 = list.get(k);
                        if(k>i){
                            list.add(i+1,change4);
                            list.remove(k+1);
                        }else{
                            int back = list.set(i+1, change4);
                            //list.add(i+1,change4);
                            //list.remove(k);
                            list.set(k, back);
                            //swap = list.remove(i+1);
                            //list.set(k,swap);
                        }
                        
                    }
                }
            }
        }
        return list;
    }



    /** Returns an arraylist of Integers that contain all mode(s) of the array numList.
   *  The mode of a list is the value that appears the greatest number of times.
   *  A list can have one mode, multiple mode, or no mode.
   *
   *  If all elements in the list appear the exact same number of times, there is no
   *  mode and this method should return an empty arraylist.
   *
   *  For example, if numList is: [1, 2, 6, 2, 3, 4, 6, 5, 5, 6, 7],
   *  then numList contains one mode: 6
   *  and this method returns an arrayList containing 6
   *
   *  If numList is: [1, 2, 3, 2, 4, 5, 5, 6],
   *  then numList contains two modes: 2, 5
   *  and this method returns an arraylist containing 2 and 5 (in any order)
   *
   *  If numList is: [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6],
   *  then numList contains no mode because all values appear the same number of times
   *  and this method returns an empty arrayList: []
   *
   *  Does NOT mutate (modify) elements in numList
   *  PRECONDITIONS: numList.length > 0
   *
   *  @param numList  numList of ints
   */
    public static ArrayList<Integer> modes(int[] numList){
        int mode1 = 0;
        int mode2 = 0;
        int modeduplicateCount = 0;
        int maxCount = 0;
        boolean wasRemoved = false;
        
        ArrayList<Integer> modes = new ArrayList<Integer>();
        ArrayList<Integer> liststuff = new ArrayList<Integer>();
        int count;
        
        for(int i = 0; i < numList.length; i++){
            count = 0;
            for(int j = 0; j < numList.length; j++){
                if(numList[i] == numList[j]){
                    count++;
                }
                
            }
            liststuff.add(numList[i]);
            liststuff.add(count);
        }
        for(int i = 0; i < liststuff.size(); i+=2){
             for(int k = i+2; k < liststuff.size(); k+=2){
                 if(liststuff.get(i) == liststuff.get(k)){
                     liststuff.remove(k);
                     liststuff.remove(k);
                 }
             }
         }
         for(int i = 1; i < liststuff.size(); i+=2){
            if(liststuff.get(i) > maxCount){
                maxCount = liststuff.get(i);
            }
         }
          for(int i = 1; i < liststuff.size(); i+=2){
             if(liststuff.get(i) < maxCount){
                 liststuff.remove(i);
                 liststuff.remove(i-1);
                 wasRemoved = true;
                 i-=2;
             }
          }
         
         
         if(!wasRemoved){
            return new ArrayList();
         }
         for(int i = 1; i < liststuff.size(); i+=2){
             liststuff.remove(i);
            i-=1;
          }
          if(liststuff.get(0) ==1 && liststuff.get(1) == 1){
            liststuff.remove(0);
          }
        return liststuff;
    }
    

        
        
        
        
        
        
        
        
        
        // for(int i = 0; i < numList.length; i++){
        //      count = 0;
        //      numbers.add(numList[i]);
        //      for(int k = 0; k < numList.length; k++){
        //          if(numList[i] == numList[k]){
        //              count++;
        //          }
        //      }
        //      countValues.add(count);
        //  }
        //  for(int i = 0; i < countValues.size(); i++){
        //      for(int k = 0; k < numbers.size(); k++){
        //          if(countValues.get(i)>max){
        //              modes.add(numbers.get(k));
        //              max = countValues.get(i);
        //          }
        //          if(countValues.get(i) == max && numbers.get(k)!=max){
        //             modes.add(numbers.get(k));
        //          }
        //      }
        //  }
        //  if(modes.size() == numbers.size()){
        //     modes.clear();
        //  }
        //  return modes;
        }
         
         
        
        
        
        
        
        
        
        
        
         // ArrayList<Integer> countValues = new ArrayList<>();
        // ArrayList<Integer> numbers = new ArrayList<>();
        // ArrayList<Integer> modes = new ArrayList<>();
        // int max = 0;

        // for (int i = 0; i < numList.length; i++) {
        //     int count = 0;
        //     boolean Duplicate = false;
        //     for (int j = 0; j < numbers.size(); j++) {
        //         if (numList[i] == numbers.get(j)) {
        //             Duplicate = true;
        //             break;
        //         }
        //     }
        //     if (!Duplicate) {
        //         for (int k = 0; k < numList.length; k++) {
        //             if (numList[i] == numList[k]) {
        //                 count++;
        //             }
        //         }
        //         numbers.add(numList[i]);
        //         countValues.add(count);
        //     }
        // }

        // for (int count : countValues) {
        //     if (count > max) {
        //         max = count;
        //     }
        // }

        // for (int i = 0; i < countValues.size(); i++) {
        //     if (countValues.get(i) == max) {
        //         modes.add(numbers.get(i));
        //     }
        // }

        // if (modes.size() == numbers.size()) {
        //     return new ArrayList<>();
        // }

        // return modes;
    

        
       
        
        
    //     boolean istheretwoModes = false;
    //     for(int i = 0; i < numList.length; i++){
    //         count = 0;
    //         for(int k = 0; k < numList.length; k++){
    //             if(numList[i] == numList[k]){
    //                 count++;
    //             }
    //         }
    //         if(count > mode1){
    //             mode1 = count;
    //         }
    //         if(count == mode1){
    //             mode1 = count;
    //             mode2 = count;
    //             istheretwoModes = true;
    //         }
    //     }
    //     modes.add(mode1);
    //     if(istheretwoModes){
    //         modes.add(mode2);
        
        
    // }
    // return modes;
    
