Client - > Duck
Adaptee -> Turkey

Duck->quack() must invoke gobble()...
So Class TurkeyAdapter is created.



MallardDuck ---is a ---> Interfcae Duck 
WildTurkey  ---is a ---> Interface Turkey

TurkeyAdapter ---is a ---> Duck

TurkeyAdapter(Turkey turkey) {
this.turkey = turkey;
}
so TurkeyAdapter will implement quack().

From TurkeyAdapter::quack() {
turkey.gobble()
} 

