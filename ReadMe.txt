In this Module, we will take a look at generator. Namely Id generator.
There are four types of ID generator

GenerationType.AUTO
GenerationType.IDENTITY
GenerationType.SEQUENCE
GenerationType.TABLE

GenerationType is an Enumeration from JPA

GenerationType.AUTO:
Means that we tell the Generator to go on and check with the underlying database what sort of generation strategy is support, out of IDENTITY, SEQUENCE and
TABLE.

GenerationType.IDENTITY:
The persistant provider in this case will depend on the auto increment value, when the record in inserted. To use
The identity generation type, we would be required to mark the primary key column as an auto increment primary key

GenerationType.SEQUENCE:
We can create a sequence in the database, and then use that database sequence for the primary key. mysql does not support sequences. we need to tell the
persistant layer which sequence it needs to use.

GenerationType.TABLE:
we use a special table and our persistant provider will use this table. the persistant provider will generate a value and put that value in the table. It
will also use the value then as a primary key in the table.The next time we are inserting a record, it will look at the previous value, generate a new value
and the use that value.


