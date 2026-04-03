param([string]$file)
$FX = "C:\javafx-sdk-25.0.2\lib"
$JDK = "C:\Program Files\Java\jdk-26\bin"

& "$JDK\javac.exe" --module-path $FX --add-modules javafx.controls,javafx.fxml -d out $file

$class = $file -replace '\\', '.' -replace '\.java$', ''
& "$JDK\java.exe" --module-path $FX --add-modules javafx.controls,javafx.fxml -cp out $class