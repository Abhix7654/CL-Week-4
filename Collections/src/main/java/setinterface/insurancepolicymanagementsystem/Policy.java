package setinterface.insurancepolicymanagementsystem;
class Policy implements Comparable<Policy> {
    String policyNumber;
    String policyHolder;
    Integer expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyHolder, int expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public Integer getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }


}