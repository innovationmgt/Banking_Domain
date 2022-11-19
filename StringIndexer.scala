import org.apache.spark.ml.feature.StringIndexer

val df = spark.createDataFrame(
    Seq((0,"a"), (1,"b"), (2,"c"), (3, "d"), (4, "e"), (5, "f"))
).toDF("id", "category")

val indexer = new StringInexer()
    .setInputCol("category")
    .setOutputCol("categoryInex")

val indexed = indexer.fit(df).transform(df)

display(indexed)
    