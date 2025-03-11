package meeting4;

import smile.classification.KNN;
import smile.data.DataFrame;
import smile.data.formula.Formula;
import smile.io.Read;

public class TrainModel {
    public static void main(String[] args) throws Exception {
        DataFrame iris = Read.csv("iris.csv");
        int[] labels = iris.column("class").toIntArray();
        double[][] features = iris.drop("class").toArray();
        
        KNN<double[]> knn = KNN.fit(features, labels, 3);
        System.out.println("Model trained with 3 neighbors!");
    }
}
