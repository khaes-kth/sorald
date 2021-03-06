package sorald.sonar;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.File;
import org.junit.jupiter.api.Test;
import org.sonar.java.se.checks.XxeProcessingCheck;
import sorald.TestHelper;

public class RuleViolationTest {
    @Test
    public void equals_onNonRuleViolationType_returnsFalse() {
        File resources = TestHelper.PATH_TO_RESOURCES_FOLDER.toFile();
        RuleViolation violation =
                ProjectScanner.scanProject(resources, resources, new XxeProcessingCheck()).stream()
                        .findFirst()
                        .get();

        assertNotEquals(violation, 2);
    }
}
