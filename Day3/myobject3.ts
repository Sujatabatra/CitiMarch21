//A class can have only one constructor, constructor overloading is not allowed in ts
class Student{  
    constructor(private sid:number,private sname:string){

    }

    display(){
        console.log("sid : "+this.sid);
        console.log("sname : "+this.sname);

    }
}

var stud:Student=new Student(101,'AAAAA');
stud.display();