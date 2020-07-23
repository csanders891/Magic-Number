
var name=prompt("Please enter your name");

var number;
var magicNumber=0;
var i=0;

do{
var letter=name.charAt(i);

if (letter=='A' || letter=='a')
number=1;

else if (letter=='B' || letter=='b')
number=2;

else if (letter=='C' || letter=='c')
number=3;

else if (letter=='D' || letter=='d')
number=4;

else if (letter=='E' || letter=='e')
number=5;

else if (letter=='F' || letter=='f')
number=6;

else if (letter=='G' || letter=='g')
number=7;

else if (letter=='H' || letter=='h')
number=8;

else if (letter=='I' || letter=='i')
number=9;

else if (letter=='J' || letter=='j')
number=10;

else if (letter=='K' || letter=='k')
number=11;

else if (letter=='L' || letter=='l')
number=12;

else if (letter=='M' || letter=='m')
number=13;

else if (letter=='N' || letter=='n')
number=14;

else if (letter=='O' || letter=='o')
number=15;

else if (letter=='P' || letter=='p')
number=16;

else if (letter=='Q' || letter=='q')
number=17;

else if (letter=='R' || letter=='r')
number=18;

else if (letter=='S' || letter=='s')
number=19;

else if (letter=='T' || letter=='t')
number=20;

else if (letter=='U' || letter=='u')
number=21;

else if (letter=='V' || letter=='v')
number=22;

else if (letter=='W' || letter=='w')
number=23;

else if (letter=='X' || letter=='x')
number=24;

else if (letter=='Y' || letter=='y')
number=25;

else if (letter=='Z' || letter=='z')
number=26;

magicNumber+=number;
i++;

}while(i<name.length)

var hundreds, tens, ones;  //digits in the hundreds, tens, and ones place are used to find magic number
while(magicNumber>9)
{
if(magicNumber >9 && magicNumber < 100)
{
	hundreds=0; //since the result is a 2 digit number, there is nothing in the hundreds place
	tens=magicNumber/10;
	ones=magicNumber%10;
}
else if(magicNumber >99 && magicNumber < 400)
{
	hundreds=magicNumber/100;
	tens=(magicNumber/10)%10;
	ones=magicNumber%10;	
}
magicNumber=hundreds+tens+ones;
}
//make magicNumber a whole number
var rounded=Math.round(magicNumber);	//rounds to whole number

if(rounded>magicNumber)
{
	rounded--;		//makes rounded number consistant with magic number since it rounded up
	magicNumber=rounded;
}

else
 magicNumber=rounded;	//didn't round up

alert("Your magic number is "+ magicNumber);