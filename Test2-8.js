//Test 2 Q8
const first = () => {
  let a = 100;
  console.log(`In the first() function, a = ${a}`);

  const second = () => {
    a = 200;
    console.log(`In the second() function, a = ${a}`);
    try {
      console.log(`In the second() function, b = ${b}`);
    } catch (err) {
      console.log("Variable b cannot be accessed by the child function");
    }
    const third = (b) => {
      a = 300;
      console.log(`In the third() function, a = ${a}`);
    };
    third();
  };
  second();
  const b = 0;

  console.log(`After these function calls a = ${a}`);
  console.log(`Variable b after these function calls = ${b}`);
};
first();
