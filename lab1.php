<?php
//print the following 02 lines on screen using only 1 echo statement
/*
Tomorrow I'll learn "PHP" and xampp is installed on c:\xampp\ 
I will have a lot of <$>.
*/


echo "CÂU 1"."<br>"."Tomorrow I'll learn \"PHP\" and xampp is installed on c:\\xampp\\"."<br>"."I will have a lot of <$>.";

//print the following rectangle on screen
/*

*************
*           *
*           *
*           *
*           *
*           *
*           *
*           *
*           *
*************

*/
echo "<br>"."<br>"."<br>"."<br>"."CÂU 2"."<br>";
echo "*************"."<br>";
echo "*"."&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;"  ."*"."<br>";
echo "*"."&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;"  ."*"."<br>";
echo "*"."&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;"  ."*"."<br>";
echo "*"."&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;"  ."*"."<br>";
echo "*"."&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;"  ."*"."<br>";
echo "*"."&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;"  ."*"."<br>";
echo "*"."&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;"  ."*"."<br>";
echo "*"."&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;"  ."*";
echo "<br>"."*************";



//let radius = 5, find the circumference and area of the circle
echo "<br>"."<br>"."<br>"."<br>"."CÂU 3"."<br>";
$radius = 5;
echo "the circumference: " .($radius * 2 * pi())."<br>";
echo "the circle: ".(pi() * pow($radius,2));

//On 1st-Jan-2018, I open a bank account of 50,000,000 VND with interest rate = 7.13% for 12 months. How much money do I have after 3 years?
echo "<br>"."<br>"."<br>"."<br>"."CÂU 4"."<br>";
$account = 50000000;
$rate = 0.0713;
$year = 3;
echo "Your money after 3 year: ".($account*pow(1+$rate,$year));


//temperature now is 12 Celsius degrees, find the Fahrenheit degree?
// 12 C = ?? F
echo "<br>"."<br>"."<br>"."<br>"."CÂU 5"."<br>";
$Celsius = 12;
echo "Fahrenheit: ".($Celsius * 1.8 + 32);


//initiate an array of 7 numbers. Find the sum and the average.
echo "<br>"."<br>"."<br>"."<br>"."CÂU 6"."<br>";
$arr = [1,2,3,4,5,6,7];
echo "sum: ".($arr[0]+$arr[1]+$arr[2]+$arr[3]+$arr[4]+$arr[5]+$arr[6]."<br>");
echo "average: ".(($arr[0]+$arr[1]+$arr[2]+$arr[3]+$arr[4]+$arr[5]+$arr[6])/7);

//write code to swap values of 2 variables
//$a=5, $b=7 ----> $a=7, $b=5
echo "<br>"."<br>"."<br>"."<br>"."CÂU 7"."<br>";
$a=5;
$b=7;
$c;
echo "a = ".($a)."<br>";
echo "b = ".($b)."<br>";
$c=$a;
$a=$b;
$b=$c;
echo '$a =';
echo $a;
echo'<br>';
echo '$b =';
echo $b;


//complete embed.php to have result of embed_end.png


?>