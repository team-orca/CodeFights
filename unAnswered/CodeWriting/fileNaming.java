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

