# TDT4250

By: Rolf Aas


### Folder structure

* `model/` contains the Ecore model and genmodel files
* `src-gen/` contains automatically generated code, as well as hand written code
  * `src-gen/assignement1.sp` contains the interfaces of each class/enums
  * `src-gen/assignment1.sp.impl` contants the actualt implemented classes/enums
  * `src-gen/assignment1.sp.util`

### Model

![Model](https://raw.githubusercontent.com/reaas/TDT4250/master/model.png)


### Rationale
* A study programme consists of n-number of semesters, and can contain several specializations
* A specialization is only selectable in a sepcific semester of a programme
* A semester contains courses whos credits should add up to 30 for each semester
* The available courses are either mandatory or elective, depending on the specifications of the programme/spesialization


### TODO
* Setup constraints on `courseLevel`. Should check that a semester has number of required number of courses on the given level
* Write tests for all entities
