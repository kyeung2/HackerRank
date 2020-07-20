package io.nimbus.hackerrank.interviewperparationkit.stringmanipulation.medium;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class SherlockAndTheValidString {

    static String isValid(String s) {

        Map<Character, Long> charFrequency = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Map<Long, Long> frequencyOccurrences = charFrequency.values()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );


        // if we only have one frequency we are good
        if (frequencyOccurrences.size() == 1) {
            return "YES";
        } else if (frequencyOccurrences.size() == 2) {

            Iterator<Map.Entry<Long, Long>> entries = frequencyOccurrences.entrySet().iterator();
            Map.Entry<Long, Long> entry1 = entries.next();
            Map.Entry<Long, Long> entry2 = entries.next();

            long maxKey = Math.max(entry1.getKey(), entry2.getKey());
            long minKey = Math.min(entry1.getKey(), entry2.getKey());

            // if there are only 2 frequencies and the difference is 1      // if the greater occurs once, then we can remove one character
            //                // and add to the smaller frequency, so only one frequency is left
            if (maxKey - minKey == 1 && frequencyOccurrences.get(maxKey) == 1
                    ||
                    //OR the smaller is actually one character and occurs once as well
                    // removing it also makes this valid.
                    minKey == 1 && frequencyOccurrences.get(minKey) == 1
            ) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
//        System.out.println(isValid(""));
//        System.out.println(isValid("abc"));
//        System.out.println(isValid("abcc"));
//        System.out.println(isValid("aabbccc"));
//        System.out.println(isValid("abccc"));
//        System.out.println(isValid("aabbccddeefghi"));
        System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));


    }
}
