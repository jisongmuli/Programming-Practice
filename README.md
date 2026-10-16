# Programming Practice

Java 基础、PTA 题目练习与 React 计数器示例。这是学习代码集合，各个入口独立运行。

## Java

- `src/`：按学习阶段整理的 PTA / Java 练习。
- `java-basics/`：循环、数组、集合和基础语法等练习。

使用 JDK 17 或更新版本，在 IntelliJ IDEA 等 IDE 中将上述目录分别设为源码目录，选择含 `public static void main` 的类运行。部分题目需要从标准输入提供数据；这些文件不是一个统一启动的应用。

## React

```sh
cd react-counter
npm ci
npm run dev
```

使用满足 `react-counter/package.json` 中 Vite 要求的 Node.js 版本。计数器基于 Vite React 模板，第三方框架和模板资源保留各自许可。

本仓库原创练习代码采用 [MIT](LICENSE)。题目原文和第三方依赖不属于该授权。
