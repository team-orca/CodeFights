///Question
You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

Return an array of names that will be given to the files.

Example

For names

["doc", "doc", "image", "doc(1)", "doc"]
the answer will be

["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"]
[input] array.string names

[output] array.string

///CODE////
String[] fileNaming(String[] names) {

}
///Input1///
Input(s)
names: ["doc", 
 "doc", 
 "image", 
 "doc(1)", 
 "doc"]
 ///Output1///
 Expected Output
["doc", 
 "doc(1)", 
 "image", 
 "doc(1)(1)", 
 "doc(2)"]
 ///Input2///
 Input(s)
names: ["a(1)", 
 "a(6)", 
 "a", 
 "a", 
 "a", 
 "a", 
 "a", 
 "a", 
 "a", 
 "a", 
 "a", 
 "a"]
 ///Output2///
 Expected Output2
["a(1)", 
 "a(6)", 
 "a", 
 "a(2)", 
 "a(3)", 
 "a(4)", 
 "a(5)", 
 "a(7)", 
 "a(8)", 
 "a(9)", 
 "a(10)", 
 "a(11)"]

