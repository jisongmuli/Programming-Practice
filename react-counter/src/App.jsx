import { useState } from "react";

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <h2>计数：{count}</h2>
      <button onClick={() => setCount(count + 1)}>
        加一
      </button>
    </div>
  );
}

export default Counter;