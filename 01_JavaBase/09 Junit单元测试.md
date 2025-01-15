### JUnit单元测试的使用

1. **需要导入的jar包：**
   - junit-4.12.jar
   - hamcrest-core-1.3.jar

2. **导入步骤：**
   - 参考课件或官方文档

3. **创建单元测试类，进行测试**
   - 见代码示例

4. **要正确编写单元测试方法，需要满足：**
   - 类必须是`public`、`非抽象的`，`并包含唯一的无参构造器`。
   - 使用`@Test`标记的方法必须是`public`、`非抽象的`、`非静态的`，`void 无返回值`，`无参数的`。

5. **解决单元测试方法中Scanner失效的问题**
   - 在单元测试中，由于无法交互式输入，可以考虑模拟输入流，或将需要输入的值作为参数传递给被测试方法。

6. **将单元测试方法设置为一个模板**
   - 可以在开发环境中设置单元测试方法的模板，以便快速创建符合要求的单元测试方法。

```java
// 示例代码
import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

    @Test
    public void testAddition() {
        int result = Calculator.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testSubtraction() {
        int result = Calculator.subtract(10, 5);
        assertEquals(5, result);
    }
}
```

通过JUnit进行单元测试可以有效验证代码的正确性，加快开发速度，并确保代码更加健壮和可维护。