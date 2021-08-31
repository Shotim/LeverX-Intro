# LeverX Stream Task

## Important information:
1) You can find some useful materials in [Materials.md](materials/Materials.md);
2) Pay attention to the file [Self-check.md](Self-check.md);
3) You are able to use Lombok and object-mapping libraries;
4) Do not write all code in one class! Use service layer for business logics and feel free to divide logics by methods.

## Task description:
You have to implement **tasks given below** using **Java 8+ Stream API**.

## Tasks:
1) There is a list with objects from class [Student](sources/Student.java) . Calculate an average score for a specific subject. Fill in the collection yourself.
2) Find first 5 READING tasks sorted by creation date and concatenate the values of the title field into one line separated by commas. Use [this](sources/Task.java) class and [initial](sources/TaskInitialization.txt) data.
3) Convert [Task](sources/Task.java) to [TaskDto](sources/TaskDto.java).
4) Use class [Student](sources/Student.java) and make an algorithm that as a result will show the lists of students with their grades in each subject. Each line of the report will include the name of the subject, and then a list of names of students with their grades.
    ```
   Example:
   Math: (Steve: 7, Andrew: 8)
    Physics: (Andrew: 9, Dan: 8)
    ```
5) Group models from 2 task by any 4 parameters.
6) Considering strings such as: a = "aaabbxxxxxtx" b = "p1p1p1p". Implement func(string) that returns the most common character, and the number of times it appears in the string passed as single argument.
    ``` 
    print func(a)
    ["x", 6]
    print func(b)
    ["p", 4]
    ```
7) Find best matching person. For example, if someone is looking for English with more than 50% proficiency then we need to search for Person whose proficiency is more than 50%. In [this](sources/Person.txt) file there is Gnanesh who has 100% proficiency in English. If none of the Person meets Given threshold (Case for Kannada in above example) then find Technician who is best among rest ie Suresh in the above case (40%). System should be bookkeeping i.e. if we book a slot then it must not be offered again. Use [this](sources/Person.txt) file. 

## Deadline:
**3** days