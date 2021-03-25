class Person{
    firstName:string;
    lastName:string;

    getFullName(){
        return this.firstName+" "+this.lastName;
    }
}

var p:Person=new Person();
p.firstName='sujata';
p.lastName='batra';
console.log(p.getFullName());