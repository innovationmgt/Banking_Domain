# test the Model
val prediction = model..transform(testing)
val predicted = prediction.select("features", "prediction", "trueLabel")
predicted.show(100)

// model evaluation comes after predicting customer response
import org.apache.spark.ml.evaluation.BinaryClassificationEvaluator

val = evaluator = new BinaryClassificationEvaluator().setLabelCol("trueLabel").setRawPredictionCol("rawPrediction").setMetricName("areaUnderRoc")
val auc = evaluator.evaluate(prediction)
println("AUC = " + (auc))

//train a classification model(Decision tree classifier)
import org.apache.spark.ml.classication.DecisionTreeClassificationModel
import org.apache.spark.ml.classication.DecisionTreeClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

val dt = new DecisionTreeClassifier().setLabelCol("label").setFeaturesCol("features")

val model = dt.fit(training)

println("Model Trained!")

//classification model evaluation
val evaluator = new MulticlassClassificationEvaluator()
  .setLabelCol("trueLabel")
  .setRawPredictionCol("prediction")
  .setMetricName("accuracy")
val accuracy = evaluator.evaluate(prediction)