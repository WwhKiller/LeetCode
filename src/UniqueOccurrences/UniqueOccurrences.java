package UniqueOccurrences;

import java.util.*;

/**
 * @description:  1207. 独一无二的出现次数
 * @author: wwh
 * @create: 2020/10/28
 */
public class UniqueOccurrences {

    public static void main(String[] args) {
    int[] arr  =
            {137,-294,-211,-211,-416,-51,74,-461,-461,-233,-294,-51,-467,-416,398,-315,-294,-461,134,74,-497,398,218,-467,-461,134,218,218,116,-294,495,74,-211,-416,425,381,-497,74,425,-315,140,-315,346,-315,-416,381,-211,-259,398,-259,398,116,-423,265,-57,346,495,-461,-416,-467,-57,425,116,425,137,-57,346,-315,-467,-497,265,-315,-461,222,346,137,-51,381,222,-315,-233,-461,265,218,265,222,425,134,-407,-423,-233,-315,-467,381,137,346,398,134,218,495,134,381,218,218,-416,137,-51,-461,425,-416,-315,-211,-467,218,134,495,398,-461,346,-467,-315,-51,116,495,-303,218,-51,140,-211,495,-211,-461,-467,218,-259,425,-407,-315,-407,-51,-467,425,495,398,265,-51,-467,-461,74,-259,265,-51,495,425,-294,381,-497,-467,-233,-211,495,381,222,-233,-416,74,381,116,-461,222,381,-461,-315,134,-315,137,74,-51,74,425,381,425,-467,398,-51,-303,154,495,-467,425,140,425,346,137,-211,-461,-315,346,-467,495,-416,-51,-467,265,265,222,-144,495,222,-467,-467,222,134,222,-57,134,425,495,-416,-416,-233,222,-315,-57,-416,425,-233,398,-57,-233,-315,265,-315,381,-57,-294,346,381,425,-315,425,134,137,425,-57,218,-315,218,-259,116,-294,-57,-294,-467,381,381,-51,-233,425,140,425,280,-315,-467,381,346,381,-423,137,-407,134,398,-467,-315,74,-51,-461,-407,-416,218,-416,346,425,218,222,-461,137,280,-461,74,398,-51,-497,-51,-51,-315,222,-315,495,222,137,-211,398,425,137,-233,140,495,-259,-233,-461,381,-467,-315,134,381,74,495,-294,495,134,116,134,222,-211,381,-294,-51,265,-467,-461,134,425,-211,-233,74,-461,-259,137,-467,346,74,140,-259,-294,-233,-51,-461,-315,346,-259,134,218,218,218,-57,-315,381,222,425,425,-57,346,-211,346,346,-407,-416,-233,134,495,381,137,495,222,222,-315,218,-416,495,-461,137,495,425,-461,-233,346,134,495,-51,-467,-211,218,-294,-467,425,-467,-51,-211,-233,495,-211,134,-259,381,-497,218,137,425,137,134,137,137,134,346,-467,-315,137,-416,280,381,381,218,-315,-51,218,134,-57,-233,-461,-315,-51,74,495,222,-303,-211,381,398,-57,280,-467,425,-461,140,280,134,-211,74,-461,222,-461,218,-51,137,425,-497,425,222,-233,134,-294,-144,218,265,140,134,-233,-259,381,495,381,398,-211,-259,398,218,-211,-315,218,381,-303,218,-461,381,-57,495,-497,74,425,137,381,425,140,-211,-467};

        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occur = new HashMap<Integer, Integer>();
        for (int x : arr) {
            occur.put(x, occur.getOrDefault(x, 0) + 1);
        }
        Set<Integer> times = new HashSet<Integer>();
        for (Map.Entry<Integer, Integer> x : occur.entrySet()) {
            times.add(x.getValue());
        }
        return times.size() == occur.size();
    }

}
