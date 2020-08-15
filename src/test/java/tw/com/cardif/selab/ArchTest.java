package tw.com.cardif.selab;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("tw.com.cardif.selab");

        noClasses()
            .that()
                .resideInAnyPackage("tw.com.cardif.selab.service..")
            .or()
                .resideInAnyPackage("tw.com.cardif.selab.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..tw.com.cardif.selab.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
