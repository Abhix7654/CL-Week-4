package setinterface.insurancepolicymanagementsystem;

import java.util.*;


public class InsurancePolicyManagementSystem {

    private static Set<Policy> hashSetPolicies = new HashSet<>();
    private static Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private static Set<Policy> treeSetPolicies = new TreeSet<>();

    public static   void addPolicyToSets(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public static Set<Policy> getAllUniquePolicies() {
        return hashSetPolicies;
    }

    public static Set<Policy> getExpiringPoliciesSoon() {
        Set<Policy> expiringPolicies = new HashSet<>();

        for (Policy policy : hashSetPolicies) {
            if (policy.getExpiryDate()<30) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }

    public static Set<Policy> getPoliciesByCoverageType(String coverageType) {
        Set<Policy> policies = new HashSet<>();
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    public static Set<Policy> getDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<String> seenPolicyNumbers = new HashSet<>();

        for (Policy policy : hashSetPolicies) {
            if (seenPolicyNumbers.contains(policy.policyNumber)) {
                duplicates.add(policy);
            }
            seenPolicyNumbers.add(policy.policyNumber);
        }
        return duplicates;
    }

    public static void comparePerformance() {
        long startTime, endTime;

        startTime = System.nanoTime();
        hashSetPolicies.add(new Policy("P100", "John Doe", 20, "Health", 2000));
        endTime = System.nanoTime();
        System.out.println("HashSet Add Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSetPolicies.add(new Policy("P101", "Jane Doe", 30, "Auto", 1500));
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSetPolicies.add(new Policy("P102", "Alice", 20, "Home", 3000));
        endTime = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (endTime - startTime) + " ns");
    }

    public static void main(String[] args) {

        Policy policy1 = new Policy("P1", "Abhishek", 20, "Health", 1000);
        Policy policy2 = new Policy("P2", "Muskan", 40, "Car", 3000);
        Policy policy3 = new Policy("P1", "Abhishek", 20, "Health", 1000);

        addPolicyToSets(policy1);
        addPolicyToSets(policy2);
        addPolicyToSets(policy3);

        System.out.println("Unique Policies: " + getAllUniquePolicies().size());
        System.out.println("Expiring Soon: " + getExpiringPoliciesSoon().size());
        System.out.println("Duplicate Policies: " + getDuplicatePolicies().size());


        Set<Policy> healthPolicies = getPoliciesByCoverageType("Health");
        System.out.println("Health Policies by Coverage Type: " + healthPolicies.size()+"\n");

        comparePerformance();
    }
}