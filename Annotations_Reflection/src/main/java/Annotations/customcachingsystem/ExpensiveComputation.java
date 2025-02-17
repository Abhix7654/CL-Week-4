package Annotations.customcachingsystem;

public interface ExpensiveComputation {
    @CacheResult
    long factorial(int n);
}
