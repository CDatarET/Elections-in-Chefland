# Elections-in-Chefland
CodeChef Difficulty 1034 Problem

Elections in Chefland
Chefland has 101 citizens. It is election time, and three parties — A, B, and C — are contesting.

Each party receives a certain number of votes:

Party A receives XA votes

Party B receives XB votes

Party C receives XC votes

🏛️ Majority Rule
According to the constitution of Chefland, a party must receive a clear majority to form the government.

A clear majority means receiving strictly more than 50 votes.

✅ Output Requirement
For each test case:

If any party has a clear majority, print the name of the winning party: A, B, or C.

If no party has a clear majority, print: NOTA (None of the Above).

⚠️ Note: You may print the party names or NOTA in any letter case (e.g., nota, Nota, NOTA are all accepted).

🧾 Input Format
The first line contains a single integer T, the number of test cases.

Each of the following T lines contains three space-separated integers:
XA, XB, and XC — the votes received by parties A, B, and C respectively.

🖨️ Output Format
For each test case, output the winning party's name (A, B, or C), or NOTA.

🔍 Example
Input:

Copy
Edit
3
60 20 21
45 51 5
30 30 41
Output:

css
Copy
Edit
A
B
NOTA
