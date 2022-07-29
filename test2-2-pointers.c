#include <stdio.h>
#include <time.h>

void pointers() { 
    int arr[500][500] = {0}; 
    for(int j=0; j<5 ; j++) {
        for(int i=0; i<15; i++) {
            *(*(arr+i)+j); 
        }
    }
    return;
}

int main() {
    clock_t start, end;
    double cpu_time_used;
    start = clock();
    for(int i=0; i<10000; i++) {
        pointers();
    }
    end = clock();
    cpu_time_used = (((double) (end - start)) / CLOCKS_PER_SEC) * 1000;
    printf("Time taken with pointers in miliseconds: %f\n",cpu_time_used);
    return 0;
}


