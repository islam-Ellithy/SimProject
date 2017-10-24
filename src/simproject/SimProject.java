/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simproject;

import org.simmetrics.StringMetric;
import org.simmetrics.metrics.StringMetrics;

/**
 *
 * @author MrHacker
 */
public class SimProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "This is a sentence. It is made of words";
        String str2 = "This sentence is similar. It has almost the same words";

        String token1 = "are you understand";
        String token2 = "are you know";

        StringMetric metric = StringMetrics.cosineSimilarity();

        float result = metric.compare(str1, str2); //0.4767

        print("cosineSimilarity " + result);

        metric = StringMetrics.damerauLevenshtein();
        result = metric.compare(str1, str2); //0.4767
        print("damerauLevenshtein " + result);

        metric = StringMetrics.euclideanDistance();
        result = metric.compare(str1, str2);
        print("euclideanDistance " + result);

        metric = StringMetrics.generalizedJaccard();
        result = metric.compare(str1, str2);
        print("generalizedJaccard " + result);

        metric = StringMetrics.identity();
        result = metric.compare(str1, str2);
        print("identity " + result);

        metric = StringMetrics.jaccard();
        result = metric.compare(str1, str2);
        print("jaccard " + result);

        metric = StringMetrics.jaro();
        result = metric.compare(str1, str2);
        print("jaro " + result);

        metric = StringMetrics.smithWaterman();
        result = metric.compare(str1, str2);
        print("smithWaterman " + result);

    }

    private static void print(String msg) {
        System.out.println(msg);
    }
}
