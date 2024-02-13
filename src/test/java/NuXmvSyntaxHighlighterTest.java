//import com.intellij.openapi.editor.colors.TextAttributesKey;
//import com.intellij.psi.tree.IElementType;
//import org.junit.jupiter.api.Test;
//import org.shkandyuk.nuxmv.highlight.NuXmvSyntaxHighlighter;
//
//import static com.intellij.diagnostic.Diagnostic.assertTrue;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//class NuXmvSyntaxHighlighterTest {
//
//    private final NuXmvSyntaxHighlighter spyHighlighter = spy(new NuXmvSyntaxHighlighter());
//
//    @Test
//    void testGetHighlightingLexer() {
//        assertNotNull(spyHighlighter.getHighlightingLexer());
//    }
//
//    @Test
//    void testGetTokenHighlights() {
//        IElementType mockElementType = mock(IElementType.class);
//        TextAttributesKey[] result = spyHighlighter.getTokenHighlights(mockElementType);
//        // Assuming this YOUR_EXPECTED_RESULT
//        TextAttributesKey[] expectedResult = new TextAttributesKey[0];
//        assertArrayEquals(expectedResult, result);
//    }
//}