<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://stackedit.io/style.css" />
</head>

<body class="stackedit">
  <div class="stackedit__html"><h1 id="singteltest">singteltest</h1>
<p><strong>Environment</strong><br>
JDK 1.8.0_201, apache-maven-3.6.1, spring-boot 2.7.4</p>
<p><strong>Build and run test cases</strong><br>
mvn clean install</p>
<p><strong>Launch Application</strong><br>
mvn spingboot-run</p>
<p><strong>Test REST service</strong><br>
curl --location --request GET 'http://localhost:8080/animal/Duck'<br>
curl --location --request GET 'http://localhost:8080/animal/Butterfly'<br>
curl --location --request GET 'http://localhost:8080/animal/Lion'<br>
curl --location --request GET 'http://localhost:8080/animal/Shark'</p>
<p><strong>Run Solution</strong><br>
All the unit test cases can be executed in “Solution” class.</p>
<p><strong>Junit Testcases</strong><br>
All the Junit test cases were executed in “SingTestApplicationTests” class.</p>
<p><strong>Class Diagram</strong><br>
<img src="singteltest.png" alt="Class Diagram">
</div>
</body>

</html>
