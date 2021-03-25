class Employee{
    private eid:number;
    private ename:string;
    constructor(eid,ename){
        this.eid=eid;
        this.ename=ename;
    }

    display(){
        console.log("eid : "+this.eid);
        console.log("ename : "+this.ename);

    }
}

var emp:Employee=new Employee(101,'AAAAA');
emp.display();