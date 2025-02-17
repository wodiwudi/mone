
package run.mone.mcp.idea.function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdeaFunctionTest {

    private IdeaFunctions.IdeaOperationFunction ideaFunction;

    @BeforeEach
    void setUp() {
        ideaFunction = new IdeaFunctions.IdeaOperationFunction("6667");
//        ideaFunction.setIdeaPort(30000);
    }

    @Test
    void testCloseEditors() {
        // Assuming closeEditors returns a boolean indicating success
        String result = ideaFunction.closeAllEditors(null);
        System.out.println(result);
    }

    @Test
    void testGetContent() {
        String content = ideaFunction.getCurrentEditorContent(null);
        assertNotNull(content, "Content should not be null");
        // Add more specific assertions based on expected content
    }

    @Test
    void  testGetClassName() {
        String content = ideaFunction.getCurrentEditorClassName("zxw_test2");
        System.out.println(content);
    }
}
