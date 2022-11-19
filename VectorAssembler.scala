val assembler = new VectorAssembler().setInputCols(Array("age", "duration", "campaign", "pdays", "previous", "empvarrate", "conscpriceidx", "consconfidx", "euribor3m", "nremployed", "job_indexed","marital_indexed", "educational_indexed", "education_indexed", "default_indexed","housing_indexed", "loan_indexed", "contact_indexed", "month_indexed", "day_of_week_indexed", "poutcome_indexed")).setOutputCol("features")

val training = assembler.transform(train).select($"features", $"y_indexed".alias("label"))

training.show()