package org.example;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.lang.reflect.Method;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7)));
//        System.out.println(Arrays.toString(solution.successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16)));
//        System.out.println(solution.findMaxK(new int[]{-1,10,6,7,-7,1}));
//        System.out.println(solution.countServers(new int[][]{{1,1,0,0}, {0,0,1,0}, {0,0,1,0}, {0,0,0,1}}));
//        System.out.println(solution.countServers(new int[][]{{1,0}, {1,1} }));
//        System.out.println(solution.checkIfExist(new int[]{7,1,14,11}));
//        System.out.println(solution.findFinalValue(new int[]{2,7,9}, 4));
//        System.out.println(solution.compareVersion("1.11.1", "1.0011"));

//        System.out.println(solution.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
//        System.out.println(solution.findMaxAverage(new int[]{5}, 1));
//        System.out.println(solution.findMaxAverage(new int[]{-1}, 1));

//        System.out.println(solution.numRescueBoats(new int[]{3,2,2,1}, 3));

//        System.out.println(solution.subarraysDivByK(new int[]{4,5,0,-2,-3,1}, 5));
//        System.out.println(solution.subarraysDivByK(new int[]{5}, 9));
//        System.out.println(solution.subarraysDivByK(new int[]{0,-5}, 10));

//        System.out.println(solution.maximumHappinessSum(new int[]{2,3,4,5}, 1));
//        System.out.println(solution.maximumHappinessSum(new int[]{1,2,3}, 2));

//        System.out.println(solution.specialArray(new int[]{0,4,3,0,4}));
//        System.out.println(solution.specialArray(new int[]{5, 3}));
//        System.out.println(solution.specialArray(new int[]{0,4,3,0,4}));

//        System.out.println(solution.equalSubstring("abcd", "bcdf", 3));
//        System.out.println(solution.equalSubstring("abcd", "cdef", 3));
//        System.out.println(solution.equalSubstring("abcd", "acde", 0));


//        System.out.println(solution.numSteps("1101"));
//        System.out.println(solution.numSteps("1111110011101010110011100100101110010100101110111010111110110010"));


//        System.out.println(solution.scoreOfString("hello"));

//        solution.reverseString(new char[]{'h', 'e', 'l', 'l', 'o', 'e'});

//        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
//        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));

//        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(solution.lengthOfLongestSubstring("bbbbbbb"));
//        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
//        System.out.println(solution.lengthOfLongestSubstring(" "));


//        System.out.println(solution.isPalindrome(121));
//        System.out.println(solution.isPalindrome(-121));
//        System.out.println(solution.isPalindrome(10));


//        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
//        System.out.println(solution.maxArea(new int[]{1, 1}));


//        System.out.println(solution.appendCharacters("coaching", "coding"));
//        System.out.println(solution.appendCharacters("abcde", "a"));
//        System.out.println(solution.appendCharacters("z", "abcde"));


//        System.out.println(solution.commonChars(new String[]{"bella", "label", "roller"}));
//        System.out.println(solution.commonChars(new String[]{"cool", "lock", "cook"}));

//        System.out.println(3 + (5 - 3) / 2);

//        System.out.println(solution.judgeSquareSum(5));
//        System.out.println(solution.judgeSquareSum(3));
//        System.out.println(solution.judgeSquareSum(2));
//        System.out.println(solution.judgeSquareSum(1));
//        System.out.println(solution.judgeSquareSum(1000000));

        System.out.println(solution.minIncrementForUnique(new int[]{1,2,2}));
        System.out.println(solution.minIncrementForUnique(new int[]{3,2,1,2,1,7}));






//        Person p = new Person();
//        Class cl = p.getClass();
//
//        Method[] methods = cl.getDeclaredMethods();
//
//
//        System.out.println(cl.getName());
//
//        for (Method method: methods){
//            System.out.println(method.getName());
//        }

//        cl.

        preparePhoto();
    }
    static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void preparePhoto() {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Шаг 1: Загрузка и предобработка изображения с помощью OpenCV
        Mat image = Imgcodecs.imread("C:\\Users\\User\\Downloads\\photo_5289802668488911604_y.jpg");

        // Преобразование в оттенки серого
        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);

        // Бинаризация (пороговое преобразование)
        Mat binaryImage = new Mat();
        Imgproc.threshold(grayImage, binaryImage, 0, 255, Imgproc.THRESH_BINARY + Imgproc.THRESH_OTSU);

        // Сохранение обработанного изображения (по желанию)
        Imgcodecs.imwrite("C:\\Users\\User\\Downloads\\rarara.jpg", binaryImage);

    }
}