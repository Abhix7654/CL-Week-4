package setinterface.insurancepolicymanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

public class InsurancePolicyManagementSystemTest {

    @BeforeEach
    void setUp() {
        InsurancePolicyManagementSystem.getAllUniquePolicies().clear();
    }

    @Test
    void testAddPolicyToSets() {
        Policy policy = new Policy("P1", "Abhishek", 20, "Health", 1000);
        InsurancePolicyManagementSystem.addPolicyToSets(policy);

        assertEquals(1, InsurancePolicyManagementSystem.getAllUniquePolicies().size());
    }

    @Test
    void testGetAllUniquePolicies() {
        Policy policy1 = new Policy("P1", "Abhishek", 20, "Health", 1000);
        Policy policy2 = new Policy("P2", "Muskan", 40, "Car", 3000);
        InsurancePolicyManagementSystem.addPolicyToSets(policy1);
        InsurancePolicyManagementSystem.addPolicyToSets(policy2);

        Set<Policy> uniquePolicies = InsurancePolicyManagementSystem.getAllUniquePolicies();
        assertEquals(2, uniquePolicies.size());
    }

    @Test
    void testGetExpiringPoliciesSoon() {
        Policy policy1 = new Policy("P1", "Abhishek", 20, "Health", 1000);
        Policy policy2 = new Policy("P2", "Muskan", 40, "Car", 3000);
        InsurancePolicyManagementSystem.addPolicyToSets(policy1);
        InsurancePolicyManagementSystem.addPolicyToSets(policy2);

        Set<Policy> expiringPolicies = InsurancePolicyManagementSystem.getExpiringPoliciesSoon();
        assertEquals(1, expiringPolicies.size());
    }

    @Test
    void testGetPoliciesByCoverageType() {
        Policy policy1 = new Policy("P1", "Abhishek", 20, "Health", 1000);
        Policy policy2 = new Policy("P2", "Muskan", 40, "Car", 3000);
        InsurancePolicyManagementSystem.addPolicyToSets(policy1);
        InsurancePolicyManagementSystem.addPolicyToSets(policy2);

        Set<Policy> healthPolicies = InsurancePolicyManagementSystem.getPoliciesByCoverageType("Health");
        assertEquals(1, healthPolicies.size());
    }

    @Test
    void testGetDuplicatePolicies() {
        Policy policy1 = new Policy("P1", "Abhishek", 20, "Health", 1000);
        Policy policy2 = new Policy("P1", "Abhishek", 20, "Health", 1000);
        InsurancePolicyManagementSystem.addPolicyToSets(policy1);
        InsurancePolicyManagementSystem.addPolicyToSets(policy2);

        Set<Policy> duplicates = InsurancePolicyManagementSystem.getDuplicatePolicies();
        assertEquals(1, duplicates.size());
    }
}
