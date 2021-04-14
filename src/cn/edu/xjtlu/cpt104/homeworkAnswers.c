#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

int ass1_1() {
    printf("xin nian kuai le\n");
    printf("gong xi fa cai\n");
    printf("hong bao na lai\n");
    return 0;
}

int exe1_2() {
    int n;
    scanf("%d", &n);
    int i;
    for (i=0; i<=10;i++)
        printf("%dx%d = %d\n", i, n, i*n);
    return 0;
}

int exe2_2() {
    char c;
    scanf("%c", &c);
    int i, j;
    for (i = 0; i < 5; ++i) {
        for (j = 4-i; j > 0; --j)
            printf("+");
        for (j = i*2+1; j > 0; --j)
            printf("%c",c);
        for (j = 4-i; j > 0; --j)
            printf("+");
        printf("\n");
    }
    return 0;
}

int ass2_2() {
    int numberOfCandies, sizeOfBox;
    scanf("%d%d",&numberOfCandies,&sizeOfBox);
    printf("%d\n",numberOfCandies/sizeOfBox);
    printf("%d\n",numberOfCandies%sizeOfBox);
    return 0;
}

int exe2_3() {
    int n;
    double average = 0;
    scanf("%d",&n);
    int i, temp;
    for (i = 0; i < n; ++i) {
        scanf("%d",&temp);
        average += temp;
    }
    printf("%.2lf\n", average/n);
    return 0;
}

int ass2_3() {
    double money, price;
    scanf("%lf%lf", &money, &price);
    int amount =  money/price;
    printf("%d\n", amount);
    return 0;
}

// Young Hostel
int exe3_1() {
    int hoursPassedNoon;
    scanf("%d",&hoursPassedNoon);
    int price = 10 + 5 * hoursPassedNoon;
    if (price >= 53)
        price = 53;
    printf("%d\n", price);
    return 0;
}

int ass3_1() {
    int numberOfPassengers;
    double gasCost, finalCost;
    scanf("%d%lf",&numberOfPassengers,&gasCost);
    if (numberOfPassengers == 0)
        finalCost = gasCost;
    else
        finalCost =  (gasCost + 1) / (numberOfPassengers + 1);
    printf("%.2lf\n",finalCost);
    return 0;
}

// Tug of War
int exe3_2() {
    int memberCount;
    scanf("%d", &memberCount);
    int team1 = 0, team2 = 0, i, temp;
    for (i=0;i<memberCount;i++) {
        scanf("%d",&temp);
        team1 += temp;
        scanf("%d",&temp);
        team2 += temp;
    }
    printf("Team %d has an advantage\n", (team1>team2?1:2));
    printf("Total weight for team 1: %d\n", team1);
    printf("Total weight for team 2: %d\n", team2);
    return 0;
}

int ass3_2() {
    int age, weight, cost = 0;
    scanf("%d%d",&age,&weight);
    if (age < 10)
        cost = 5;
    else if (age != 60)
        cost = weight > 20 ? 40 : 30;
    printf("%d\n",cost);
    return 0;
}

int ass3_3() {
    int n, p, count = 0;
    scanf("%d",&n);
    for (; n > 0 ; --n) {
        scanf("%d",&p);
        if (p >= 10000) count++;
    }
    printf("%d\n",count);
    return 0;
}

// Fantastic Cookie Recipe
int exe4_1() {
    int ingredientWeights[10];
    int i, n;
    for (i=0; i<10; i++)
        scanf("%d", &ingredientWeights[i]);
    scanf("%d",&n);
    printf("%d\n", ingredientWeights[n-1]);
    return 0;
}

// Balanced Train Wagons
int exe4_2() {
    int n;
    scanf("%d", &n);
    double weights[20];
    double average = 0;
    int i;
    for (i = 0; i < n; ++i)
        scanf("%lf",&weights[i]),
        average += weights[i];
    average /= n;
    for (i = 0; i < n; ++i)
        printf("%.2lf\n", average - weights[i]);
    return 0;
}

int ass4_1() {
    int n;
    int myScore[25];
    scanf("%d", &n);
    int i;
    for (i = 0; i < n; ++i)
        scanf("%d", &myScore[i]);
    int friendScore, count = 0;
    for (i = 0; i < n; ++i) {
        scanf("%d", &friendScore);
        if (friendScore-myScore[i] >= 2 || friendScore-myScore[i] <= -2)
            count ++;
    }
    printf("%d\n",count);
}

int ass4_2() {
    int n;
    double price[10];
    scanf("%d", &n);
    int i;
    for (i = 0; i < n; ++i)
        scanf("%lf", &price[i]);
    double cost = 0, weight;
    for (i = 0; i < n; ++i)
        scanf("%lf", &weight),
        cost += weight*price[i];
    printf("%.3lf\n",cost);
    return 0;
}

int ass4_3() {
    int n, s[20], target;
    scanf("%d",&n);
    int i;
    for (i = 0; i < n; ++i)
        scanf("%d",&s[i]);
    scanf("%d",&target);
    if (n == 0) return 0;
    // number same as target number
    // number before and after that number
    // number different from that number before and after it
    printf("%d ", s[0]);
    for (i = 1; i < n-1; ++i)
        if (s[i]==target && s[i]!=s[i-1] && s[i]!=s[i+1])
            printf("%d ", s[i-1] > s[i+1] ? s[i-1] : s[i+1]);
        else
            printf("%d ", s[i]);
    printf("%d\n", s[i]);
    return 0;
}

// Total Expense
int exe5_1() {
    int sum = 0, temp;
    scanf("%d",&temp);
    while (temp != -1)
        sum += temp,
        scanf("%d", &temp);
    printf("%d\n", sum);
    return 0;
}

int ass5_1() {
    int totalPopulation, infectionRate;
    scanf("%d%d", &totalPopulation, &infectionRate);
    int infected = 1, days = 1, newlyInfected = 1;
    while (infected <= totalPopulation) {
        days++;
        newlyInfected = newlyInfected*infectionRate;
        infected += newlyInfected;
    }
    printf("%d\n", days);
    return 0;
}

int ass5_2() {
    int min, max;
    scanf("%d%d", &min, &max);
    int temp;
    scanf("%d", &temp);
    while (temp != -999) {
        if (temp >= min && temp <= max)
            printf("Normal\n");
        else {
            printf("Alert!\n");
            break;
        }
        scanf("%d", &temp);
    }
    return 0;
}

// Swap Name
int exe5_2() {
    int n;
    char firstName[11];
    char lastName[11];
    scanf("%d",&n);
    int i;
    for (i = 0; i < n; ++i) {
        scanf("%s %s", firstName, lastName);
        printf("%s %s\n", lastName, firstName);
    }
    return 0;
}

int ass5_3() {
    char name[31];
    scanf("%s", name);
    int i = 0;
    while (name[i++] != '\0');
    printf("%s\n", i%2==0? "odd" : "even");
    return 0;
}

int ass5_4() {
    int n;
    scanf("%d", &n);
    int i, j, maxJ = 0;
    char temp[101];
    for (i=0;i<n;i++) {
        scanf("%s",temp);
        j=0;
        while (temp[j++] != '\0');
        if (j>maxJ) maxJ = j;
    }
    printf("%d\n", j);
}

// exe6_1 Metric Conversions
double metersToFeet(double);
double gramsToPounds(double);
double celsiusToFahrenheit(double);
int exe6_1() {
    int n;
    scanf("%d", &n);
    int i;

    for (i = 0; i < n; ++i) {
        double metric;
        char unit;
        scanf("%lf %c",&metric, &unit);
        if (unit == 'c')
            printf("%.2lf f\n", celsiusToFahrenheit(metric));
        else if (unit == 'm')
            printf("%.2lf ft\n", metersToFeet(metric));
        else if (unit == 'g')
            printf("%.2lf lbs\n", gramsToPounds(metric));
    }
    return 0;
}

// ass6_1 Smallest with Min
int min(int,int);
int ass6_1() {
    int n;
    scanf("%d", &n);
    int minimum, temp, i;
    scanf("%d", &minimum);
    for (i=1; i<n; i++) {
        scanf("%d",&temp);
        minimum = min(minimum,temp);
    }
    printf("%d\n", minimum);
    return 0;
}

// ass6_2 Count Fives
int countFives(int);
int ass6_2() {
    int n;
    scanf("%d",&n);
    printf("%d\n", countFives(n));
}

// exe6_2 Fibonacci Numbers
int fibo(int);
int exe6_2() {
    int n;
    scanf("%d", &n);
    printf("%d\n", fibo(n));
}

// ass6_3 Digit Sum
int digitSum(int);
int ass6_3() {
    int n;
    scanf("%d", &n);
    printf("%d\n", digitSum(n));
}

// Total Size
int exe7_1() {
    int n;
    scanf("%d", &n);
    int i, size, totalSize = 0;
    char type;
    for (i = 0; i < n; ++i) {
        scanf("%d %c", &size, &type);
        if (type == 'i')
            totalSize += sizeof(int) * size;
        else if (type == 'c')
            totalSize +=  sizeof(char) * size;
        else if (type == 'd')
            totalSize +=  sizeof(double) * size;
        else {
            printf("invalid type");
            return 0;
        }
    }
    printf("%d bytes\n", totalSize);
    return 0;
}

// total memory
int ass7_1() {
    char type;
    long size;
    long byte = 0;
    scanf("%c %ld", &type, &size);
    if (type == 'i')
        byte = sizeof(int) * size;
    else if (type == 'd')
        byte = sizeof(double) * size;
    else if (type == 's')
        byte = sizeof(short) * size;
    else if (type == 'c')
        byte = sizeof(char) * size;
    long kilobyte = byte / 1000;
    byte -= kilobyte * 1000;
    long megabyte = kilobyte / 1000;
    kilobyte -= megabyte * 1000;
    if (megabyte != 0)
        printf("%ld MB and %ld KB and %ld B\n", megabyte, kilobyte, byte);
    else if (kilobyte != 0)
        printf("%ld KB and %ld B\n", kilobyte, byte);
    else
        printf("%ld B\n", byte);
    return 0;
}

int exe7_2() {
    int age;
    // declare an integer pointer named ageptr :
    int* ageptr;

    scanf("%d", &age);
    // store the address of age in ageptr :
    ageptr = &age;

    printf("You are now %d years old\n", * ageptr);
    // using only ageptr, lower the age by 5 years :
    *ageptr -= 5;

    printf("Five years ago, you are %d years old\n", * ageptr);
    return 0;
}

// ass7_2 Left Right Slide
void lrslide(int*, int*, int*);
int ass7_2() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    lrslide(&a,&b,&c);
    printf("%d %d %d\n", a, b, c);
    return 0;
}

// exe8_1 Sum First
int sumFirst(int*, int);
int exe8_1() {
    int arr[30], n, i = 0, temp;
    scanf("%d", &temp);
    while (temp != -1)
        arr[i++] = temp,
        scanf("%d", &temp);
    scanf("%d", &n);
    printf("%d\n", sumFirst(arr,n));
    return 0;
}

// ass8_1 Reverse AB
void reverseAB(int*, int, int);
void printArray(int*,int);
int ass8_1() {
    int array[8] = {0, 1, 2, 3, 4, 5, 6, 7};
    reverseAB(array, 2, 5);
    printArray(array, 8);
    return 0;
}

// ass8_2 All Appear
int allAppear(int*, int, int*, int);
int ass8_2() {
    int array1[5] = {1, 2, 3, 4, 5};
    // testcase 1
    int array2[3] = {2, 3, 5};
    printf("%d\n", allAppear(array1, 5, array2, 3));
    // testcase 2
    int array3[3] = {6, 1};
    printf("%d\n", allAppear(array1, 5, array3, 2));
    return 0;
}

// ass8_3 Longest Reverse
int longestReverse(int*, int);
int ass8_3() {
    // Test case 1:
    int array1[9] = {1, 2, 3, 4, 5, 3, 2, 1, 6};
    printf("%d\n", longestReverse(array1, 9));

    // Test case 2:
    int array2[6] = {3, 1, 2, 2, 1, 4};
    printf("%d\n", longestReverse(array2, 6));

    // Test case 3:
    int array3[3] = {5, 5, 5};
    printf("%d\n", longestReverse(array3, 3));
    return 0;
}

// exe9_1 Print String Lengths
void printStrLen(char**, int);
int exe9_1() {
    char* input[3] = {"x", "55", "ab34"};
    printStrLen(input, 3);
    return 0;
}

// ass9_1 Copy String
void copyStr(char*, char*);
int ass9_1() {
    char* source = "abc";
    char target[101];
    copyStr(source, target);
    printf("%s", target);
    return 0;
}

// ass9_2 Count End Char
int countEndChar(char**, int, char);
int ass9_2() {
    char* input[5] = {
            "breaking",
            "bad",
            "abcd",
            "covid",
            "panda"
    };
    printf("%d\n", countEndChar(input, 5, 'd'));
    return 0;
}

// ass9_3 Distinct Characters
int distinctChar(char**, int);
int ass9_3() {
    char* input[3] = {
            "abcdea",
            "bbb",
            "de"
    };
    printf("%d\n", distinctChar(input, 3));
    return 0;
}

// exe10_1 Allocate Int Array
int* allocateIntArr(int);
double compAverage(int*, int);
int exe10_1() {
    int num, i;
    int* array;
    scanf("%d", &num);
    array = allocateIntArr(num);
    for (i = 0; i < num; ++i)
        scanf("%d", array+i);
    printf("%.2f\n", compAverage(array, num));
    free(array);
    return 0;
}

// ass10_1 Allocate String
char* allocateString(int);
int ass10_1() {
    int length;
    char* str;
    scanf("%d", &length);
    str = allocateString(length);
    scanf("%s", str);
    printf("%s\n", str);
    free(str);
    return 0;
}

// ass10_2 Duplicate String
char* duplicateString(char*, int);
int ass10_2() {
    char* str = duplicateString("abc", 3);
    printf("%s\n", str);
    free(str);
    return 0;
}

// exe12_2 Print and Read Date
struct date {
    int year;
    int month;
    int date;
};
void readDate(struct date*);
void printDate(struct date);
int exe12_2() {
    struct date today;
    readDate(&today);
    printDate(today);
    return 0;
}

// ass12_1 Tomorrow Comes Today
struct date advanceDay(struct date);
int ass12_1() {
    struct date today, tomorrow;
    readDate(&today);
    tomorrow = advanceDay(today);
    printDate(tomorrow);
    return 0;
}

// ass12_2 Swap Date
void swapDate(struct date*, struct date*);
int ass12_2() {
    struct date d1 = {1000, 1, 5};
    struct date d2 = {2000, 2, 10};
    swapDate(&d1, &d2);
    printDate(d1);
    printDate(d2);
    return 0;
}

// lab13 point struct
struct point {
    int x;
    int y;
};
void readPoint(struct point*);
void printPoint(struct point);

// lab13 printPoly
void printPoly(struct point*, int);

// exe13_2 Initialize Polygon
void initializePoly(struct point*, int);
int exe13_2() {
    int num;
    struct point* poly;
    scanf("%d", &num);
    poly = (struct point *) malloc(num * sizeof (struct point));
    initializePoly(poly, num);
    printPoly(poly, num);
    free(poly);
    return 0;
}

// ass13_1 Shift Polygon
void shiftPoly(struct point*, int, int, int);
int ass13_1() {
    int num, i, dx, dy;
    scanf("%d", &num);
    struct point* poly;
    poly = (struct point*) malloc(num * sizeof(struct point));
    for (i = 0; i < num; i++)
        readPoint(&poly[i]);
    scanf("%d %d", &dx, &dy);
    shiftPoly(poly, num, dx, dy);
    printPoly(poly, num);
    free(poly);
    return 0;
}

// lab13 Linked List Node
struct pointNode {
    struct point pt;
    struct pointNode * next;
};
void printList(struct pointNode*);
int printListExample() {
    struct pointNode node1 = {{1, 5}, NULL};
    struct pointNode node2 = {{2, 3}, NULL};
    struct pointNode node3 = {{6, 7}, NULL};
    struct pointNode * start;
    start = &node1;
    node1.next = &node2;
    node2.next = &node3;
    printList(start);
    return 0;
}

struct pointNode * appendList(struct pointNode*, struct pointNode*);
int appendListExample() {
    struct pointNode node1 = {{1, 5}, NULL};
    struct pointNode node2 = {{2, 3}, NULL};
    struct pointNode node3 = {{6, 7}, NULL};
    struct pointNode *start, *end;
    start = end = &node1;
    end = appendList(end, &node2);
    end = appendList(end, &node3);
    printList(start);
    return 0;
}

struct pointNode * createPoint(int, int);
void freeList(struct pointNode *);

int createPointExample() {
    struct pointNode *start, *end, *newpt;
    int i, num, x, y;
    scanf("%d", &num);
    for (i = 0; i < num; ++i) {
        scanf("%d%d", &x, &y);
        newpt = createPoint(x,y);
        if (i == 0)
            start = end = newpt;
        else
            end = appendList(end, newpt);
    }
    printList(start);
    freeList(start);
    return 0;
}

// ass13_2 Find Point
struct pointNode * findPoint(struct pointNode *, int, int);
int ass13_2() {
    int num, i, x, y, qx, qy;
    struct pointNode *newpt, *start, *end;
    scanf("%d", &num);
    for (i = 0; i < num; ++i) {
        scanf("%d%d", &x, &y);
        newpt = createPoint(x,y);
        if (i == 0)
            start = end = newpt;
        else
            end = appendList(end, newpt);
    }
    scanf("%d%d", &qx, &qy);
    struct pointNode * ptr = findPoint(start, qx, qy);
    if (ptr != NULL)
        printf("Point (%d, %d) is found!\n", ptr->pt.x, ptr->pt.y);
    else
        printf("Point (%d, %d) is not found!\n", qx, qy);
    freeList(start);
    return 0;
}

// ass14_1 Create Student
struct student {
    char name[50];
    int age;
    struct student *next;
};
struct student* createStudent(char studentName[], int studentAge) {
    struct student *studptr = (struct student *) malloc(sizeof(struct student));
    int i = 0;
    while (studentName[i] != '\0') {
        studptr->name[i] = studentName[i];
        i++;
    }
    studptr->name[i] = '\0';
    studptr->age = studentAge;
    studptr->next = NULL;
    return studptr;
}
int ass14_1() {
    struct student *studptr;
    int myAge;
    char myName[50];
    scanf("%s %d", myName, &myAge);
    studptr = createStudent(myName, myAge);
    printf("Student %s is %d years old.\n", studptr->name, studptr->age);
    free(studptr);
    return 0;
}

// ass14_2 Append Student
struct student* appendStudent(struct student * end, struct student * newStudptr) {
    end->next = newStudptr;
    return end->next;
}
int ass14_2() {
    struct student *start, *newStudptr, *end;
    char name1[50], name2[50], name3[50];
    int age1, age2, age3;
    scanf("%s %s %s", name1, name2, name3);
    scanf("%d %d %d", &age1, &age2, &age3);

    start = createStudent(name1, age1);
    end = start;
    newStudptr = createStudent(name2, age2);
    end = appendStudent(end, newStudptr);
    newStudptr = createStudent(name3, age3);
    end = appendStudent(end, newStudptr);

    printf("Student %s is %d years old.\n", start->name, start->age);
    printf("Student %s is %d years old.\n", start->next->name, start->next->age);
    printf("Student %s is %d years old.\n", start->next->next->name, start->next->next->age);

    return 0;
}

// ass14_3 Print Students
void printStudents(struct student * start) {
    struct student * ptr = start;
    while (ptr != NULL) {
        printf("Student %s is %d years old.\n", ptr->name, ptr->age);
        ptr = ptr->next;
    }
}
int ass14_3() {
    struct student *start, *newStudptr, *end;
    char name1[50], name2[50], name3[50];
    int age1, age2, age3;
    scanf("%s %s %s", name1, name2, name3);
    scanf("%d %d %d", &age1, &age2, &age3);

    start = createStudent(name1, age1);
    end = start;
    newStudptr = createStudent(name2, age2);
    end = appendStudent(end, newStudptr);
    newStudptr = createStudent(name3, age3);
    end = appendStudent(end, newStudptr);

    printStudents(start);

    return 0;
}

// lab14 Digit Structure
struct digit {
    int num;
    struct digit *next;
};
struct digit * createDigit(int dig) {
    struct digit *ptr;
    ptr = (struct  digit *) malloc(sizeof(struct digit));
    ptr->num = dig;
    ptr->next = NULL;
    return  ptr;
}
struct digit * append(struct digit *end, struct digit *newDigptr) {
    end->next = newDigptr;
    return  end->next;
}
void printNumber(struct digit *start) {
    struct digit * ptr = start;
    while (ptr != NULL) {
        printf("%d", ptr->num);
        ptr = ptr->next;
    }
    printf("\n");
}
void freeNumber(struct digit *start) {
    struct digit * ptr = start;
    struct digit * tmp;
    while (ptr != NULL) {
        tmp = ptr->next;
        free(ptr);
        ptr = tmp;
    }
}
struct digit * readNumber() {
    char c;
    int d;
    struct digit *start, *end, *newptr;
    start = NULL;
    scanf("%c", &c);
    while (c != '\n') {
        d = c - 48;
        newptr = createDigit(d);
        if (start == NULL) {
            start = newptr;
            end = start;
        } else {
            end = append(end, newptr);
        }
        scanf("%c", &c);
    }
    return start;
}

// ass14_4 Divisible By Three
int divisibleByThree(struct digit * start) {
    long sum = 0;
    struct digit* ptr = start;
    while (ptr != NULL)  {
        sum += ptr->num;
        ptr = ptr->next;
    }
    return sum % 3 == 0;
}
int ass14_4() {
    struct digit *start;
    start = readNumber();
    printf("The number ");
    printNumber(start);
    if (divisibleByThree(start))
        printf("is divisible by 3.\n");
    else
        printf("is not divisible by 3.\n");
    freeNumber(start);
    return 0;
}

// lab15 Hello Thread
void * func(void * arg) {
    printf("%s\n", (char *)arg);
    return 0;
}
int helloThread() {
    pthread_t t1;
    pthread_create(&t1, NULL, func, "Hello, Thread");
    pthread_join(t1, NULL);
    return 0;
}

// exe15_1 Square Thread
int value;
void * squarethread(void*);
int exe15_1() {
    pthread_t t1;
    int i;
    scanf("%d", &i);
    pthread_create(&t1, NULL, squarethread, &i);
    pthread_join(t1, NULL);
    printf("%d\n", value);
    return 0;
}

// ass15_2 Hello N Threads
void * hello(void * arg) {
    printf("Hello Thread!\n");
    return 0;
}
void helloNthreads(pthread_t* tid, void* (*func)(void *), int n) {
    int i;
    for (i = 0; i < n; ++i)
        pthread_create(&tid[i], NULL, func, NULL);
    for (i = 0; i < n; ++i)
        pthread_join(tid[i], NULL);
}
int ass15_2() {
    int n;
    scanf("%d", &n);
    pthread_t *tid;
    tid = (pthread_t*) malloc(sizeof(pthread_t) * n);
    helloNthreads(tid, hello, n);
    return 0;
}

// exe15_3 Mutex to the Rescue!
int total;
int counter;
pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
void * increment (void *arg) {
    int i;
    pthread_mutex_lock(&mutex);
    for (i = 0; i < total; ++i)
        counter++;
    pthread_mutex_unlock(&mutex);
    return 0;
}
int exe15_3() {
    pthread_t t1, t2;
    total = 10000000;
    pthread_create(&t1, NULL, increment, NULL);
    pthread_create(&t2, NULL, increment, NULL);
    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    printf("counter = %d\n", counter);
    return 0;
}

// exe16_1 Wake me up
int sleep = 1;
pthread_cond_t cond = PTHREAD_COND_INITIALIZER;
void * wakemeup(void *arg) {
    sleep = 0;
    pthread_cond_signal(&cond);
}
int exe16_1() {
    pthread_t t1;
    printf("wake me up\n");
    pthread_create(&t1, NULL, wakemeup, NULL);
    pthread_mutex_lock(&mutex);
    while (sleep == 1) {
        pthread_cond_wait(&cond, &mutex);
    }
    pthread_mutex_unlock(&mutex);
    printf("when September ends\n");
    return 0;
}


int main() {
    int i = 100;
    int j = 100;
    printf("i:%p\tj:%p\n", &i, &j);
    return 0;
}

// exe6_1 Metric Conversions
double metersToFeet(double meters) {
    return meters * 3.2808;
}
double gramsToPounds(double grams) {
    return grams * 0.002205;
}
double celsiusToFahrenheit(double celsius) {
    return 32 + 1.8 * celsius;
}

// ass6_1 Smallest with Min
int min(int a, int b) {
    return a < b ? a : b;
}

// ass6_2 Count Fives
int countFives(int n) {
    char input[512];
    int count = 0, i, j;
    for (i = 0; i < n; ++i) {
        scanf("%s", input);
        j = 0;
        while (input[j] != '\0')
            if (input[j++] == '5')
                count++;
    }
    return count;
}

// exe6_2 Fibonacci Numbers
int fibo(int n) {
    if (n == 0 || n == 1)
        return 1;
    return fibo(n-1) + fibo(n-2);
}

// ass6_3 Digit Sum
int digitSum(int n) {
    int mod = n % 10;
    if (mod == 0)
        return n;
    return mod + digitSum(n / 10);
}

// ass7_2 Left Right Slide
void lrslide(int* a, int* b, int* c) {
    int temp = *a;
    if (temp % 2 == 0) {
        *a = *c;
        *c = *b;
        *b = temp;
    } else {
        *a = *b;
        *b = *c;
        *c = temp;
    }
}

// exe8_1 Sum First
int sumFirst(int* arr, int n) {
    int i, sum = 0;
    for (i = 0; i < n; i++)
        sum += arr[i];
    return sum;
}

// ass8_1 Reverse AB
void reverseAB(int* arr, int a, int b) {
    int temp;
    while (a < b) {
        temp = arr[a];
        arr[a++] = arr[b];
        arr[b--] = temp;
    }
}
void printArray(int* arr,int size) {
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// ass8_2 All Appear
int allAppear(int* arr1, int size1, int* arr2, int size2) {
    int allAppearedFlag = 1;
    int i, j, count = 0;
    for (i = 0; i < size2; i++) {
        for (j = 0; j < size1; j++) {
            if (arr2[i] == arr1[j]) {
                count++;
                break;
            }
        }
    }
    return size2 == count;
}

// ass8_3 Longest Reverse
int longestReverse(int* arr, int size) {
    int maxCount = 0, internalCounter, internalhead;
    int head , tail;
    for (head = 0; head < size; ++head) {
        internalCounter = 0;
        internalhead = head;
        tail = size;
        while (arr[internalhead] != arr[--tail]);
        internalCounter++;
        while (arr[++internalhead] == arr[--tail])
            internalCounter++;
        if (internalCounter > maxCount)
            maxCount = internalCounter;
    }
    return maxCount;
}

// exe9_1 Print String Lengths
void printStrLen(char** input, int num) {
    int i, j;
    for (i = 0; i < num; ++i) {
        j = 0;
        while (input[i][j]!='\0') j++;
        printf("%d\n",j);
    }
}

// ass9_1 Copy String
void copyStr(char* source, char* destination) {
    int i = 0;
    while (source[i]!='\0') {
        destination[i] = source[i];
        i++;
    }
    destination[i] = '\0';
}

// ass9_2 Count End Char
int countEndChar(char** input, int size, char target) {
    int count = 0;
    int i, j;
    for (i = 0; i < size; ++i) {
        j = 0;
        while (input[i][j] != '\0')j++;
        if (input[i][j-1] == 'd')
            count++;
    }
    return count;
}

// ass9_3 Distinct Characters (unsure)
int distinctChar(char** input, int size) {
    int i, j, k, distinctFlag, count = 0;
    for (i = 1; i < size; ++i) {
        j = 0;
        distinctFlag = 1;
        while (input[i][j] != '\0') {
            k = 0;
            while (input[0][k] != '\0') {
                if (input[i][j] == input[0][k])
                    distinctFlag = 0;
                k++;
            }
            j++;
        }
        if (!distinctFlag) {
            count++;
        }
    }
    return count;
}

// exe10_1 Allocate Int Array
int* allocateIntArr(int num) {
    return (int*) malloc(num * sizeof(int));
}
double compAverage(int* array, int num) {
    int i;
    double sum = 0.0;
    for (i = 0; i < num; i++)
        sum += array[i];
    return sum / num;
}

// ass10_1 Allocate String
char* allocateString(int length) {
    return (char*) malloc(length+1);
}

// ass10_2 Duplicate String
char* duplicateString(char* str, int repetition) {
    char* duplicate;
    int len = 0;
    while (str[len] != '\0') len++;
    duplicate = (char*) malloc(len*repetition + 1);
    int i;
    for (i = 0; i < repetition*len; i++)
        duplicate[i] = str[i % len];
    duplicate[i] = '\0';
    return duplicate;
}

// exe12_2 Print and Read Date
void readDate(struct date* dateptr) {
    scanf("%d%d%d",
          &(*dateptr).year,
          &(*dateptr).month,
          &(*dateptr).date);
}
void printDate(struct date date) {
    printf("%02d/%02d/%d\n",
           date.date,
           date.month,
           date.year);
}

// ass12_1 Tomorrow Comes Today
struct date advanceDay(struct date today) {
    int year, month, date;
    year = today.year;
    month = today.month;
    date = today.date + 1;
    int isLeap = ((year%100 != 0) && (year%4 == 0)) || ( year%400 == 0);
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
            if (date == 32) {
                date = 1;
                month++;
            }
            break;
        case 12:
            if (date == 32) {
                date = 1;
                month = 1;
                year++;
            }
        case 4:
        case 6:
        case 9:
        case 11:
            if (date == 31) {
                date = 1;
                month++;
            }
            break;
        case 2:
            if ((date == 29 && !isLeap)||(date == 30 && isLeap)) {
                date = 1;
                month++;
            }
            break;
    }
    struct date tomorrow = {year, month, date};
    return tomorrow;
}

// ass12_2 Swap Date
void swapDate(struct date* d1, struct date* d2) {
    struct date temp = *d1;
    *d1 = *d2;
    *d2 = temp;
}

// lab13 point struct
void readPoint(struct point* ptr) {
    scanf("%d%d", &ptr->x, &ptr->y);
}
void printPoint(struct point pt) {
    printf("(%d, %d)\n", pt.x, pt.y);
}

// lab13 printPoly
void printPoly(struct point* ptr, int num) {
    int i;
    for (i = 0; i < num; ++i)
        printPoint(ptr[i]);
}

// exe13_2 Initialize Polygon
void initializePoly(struct point* ptr, int num) {
    int i;
    for (i = 0; i < num; ++i) {
        ptr[i].x = -i;
        ptr[i].y = i*i;
    }
}

// ass13_1 Shift Polygon
void shiftPoly(struct point* ptr, int num, int dx, int dy) {
    int i;
    for (i = 0; i < num; ++i) {
        ptr[i].x += dx;
        ptr[i].y += dy;
    }
}

// lab13 Linked List Node
void printList(struct pointNode* start) {
    struct pointNode* ptr;
    ptr = start;
    while (ptr != NULL) {
        printPoint(ptr->pt);
        ptr = ptr->next;
    }
}
struct pointNode * appendList(struct pointNode* end, struct pointNode* new) {
    end->next = new;
    return end->next;
}
struct pointNode * createPoint(int x, int y) {
    struct pointNode * ptr;
    ptr = (struct pointNode *) malloc(sizeof(struct pointNode));
    ptr->pt.x = x;
    ptr->pt.y = y;
    ptr->next = NULL;
    return ptr;
}
void freeList(struct pointNode * start) {
    struct pointNode * ptr = start;
    while (ptr != NULL) {
        start = ptr;
        ptr = ptr->next;
        free(start);
    }
}

// ass13_2 Find Point
struct pointNode * findPoint(struct pointNode * start, int qx, int qy) {
    struct pointNode * ptr = start;
    while (ptr != NULL) {
        if (ptr->pt.x == qx && ptr->pt.y == qy)
            break;
        ptr = ptr->next;
    }
    return ptr;
}

// exe 15_1 Square Thread
void * squarethread(void* arg) {
    int* ip = (int*) arg;
    value = (*ip) * (*ip);
    return 0;
}