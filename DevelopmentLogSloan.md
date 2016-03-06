##5/2/2016
Today we began writing a class that can determine if the code inputted by the user is actually Ruby, so that the translator can work.
If it isn't, the program will throw some exceptions at them. We also began relearning Ruby, so that we can know what different Ruby
code snippets can be replaced by Java code, and retain the same functionality that the original Ruby program had. This will most
likely take quite a bit of time and testing, as we have to think of all possible Ruby commands that a user might have used in their
program.

##11/2/2016
Today I worked more on relearning Ruby, and realized how different of a programming language it is from java. I also now realize how
hard it will be to do the translator, as we have to be able to handle anything the user puts in, whether its actually code or not. We
are getting fairly close to finishng our class that can recognize actual Ruby code. After this is complete, we will begin making the
main translator class that will replace the Ruby commands with java code that can do the same thing.

##18/2/2016
Today I continued relearning Ruby, and started a list of Ruby commands that our program must recognize, and what java commands should
replace them, like puts "" -> System.out.println(""). We have done a fair amount on the actual translator class, and should be able
to complete our first deliverable on time (February 26), which are methods that can recognize Ruby loops and statements, and convert
them to the appropriate java loops and statements. However, we will most likely still need to do quite a bit of bugfixing for it to
work.

##26/2/2016
Today we tested our program, making sure that it actually is able to translate Ruby loops (do, until, while, for), to java loops. This
was pretty difficult, as we had to make the program find the file and read it line-by-line while outputting it to a new file. We also
added the simple class Variable, which we use to store the name and type of the variables in the Ruby program, so that we can create
them as java variables later. We will most likely just make eveything a state variable, as trying to keep the scope would be rather
hard.

##3/4/2016
Today I continued learning Ruby, figuring out how different commands run so that we can have our program create java code that does
the same thing. We also added the ability to translate things like 'puts' and implemented the equivalent of 'gets.chomp'. We will
still need to edit the 'puts' translator however, as it doesn't always work if the Ruby code is using puts to print a variable. This
shouldn't be too difficult to fix though.
