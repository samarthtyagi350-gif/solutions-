const obj = {
  name: "Samarth",
  greet() {
    let name="samarth"
    function inner(name) {
    
      console.log(this.name);
    }
    inner(name);
  }
};

obj.greet();