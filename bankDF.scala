import org.apache.spark.sql.functions._
import org.apache.spark.sql.Row
import org.apache.spark.sql.types._

import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.VectorAssembler  //ML models like logistic regression and Decision tree 


val bankDF = sqlContext.read.format("csv")
  .option("header", "true")
  .option("inferScheme", "true")
  .option("delimiter", ";")
  .option("/SOURCECODE/29103444-bank.csv")

//List all String Data type Columns in an Array in further processing
var StringfeatureCol = Array("job", "marital", "education", "default", "housing", "loan", "contact", "month", "day_of_ week", "poutcome", "y")
  
//display(bankDF)
//bankDF.show()

//bankDF.printScheme();


//creating a temp view from the dataframe
//bankDF.createOrReplaceTempView("BankData")

//Query the TempView
//select * from BankData 

//select y as Subscribe_To_Product, count(y) as Subscribe_To_Product_Count from BankData group by y; 

//select age, count(age) from BankData group by age order by age

//Mean age
//select mean(age) from BankData

//Jobs
//select job, count(job) from BankData group by job;




