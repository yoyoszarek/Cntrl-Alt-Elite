.data
prompt: .asciiz "Enter the value of n: "
result: .word 0

.text 
.globl main

main:
#prompt user input
li $v0, 4
la $a0, prompt
syscall

#recieve user input and store at $a0
li $v0, 5
syscall
move $a0, $v0

#call Fibonacci Function
jal Fibonacci

#Display to user the result
lw $a0, result
li $v0, 1
syscall

#close program
li $v0, 10
syscall

Fibonacci:
#make room on stack and store return address and argument
addi $sp, $sp, -12
sw $ra, 4($sp)
sw $a0, 0($sp)

#copy the user input n to 
move $t0, $a0
li $t1, 0
li $t2, 1

loop:
#check if n is 0 or 1
beq $t0, 0, end_Fib 
beq $t0, 1, end_Fib

add $t3, $t1, $t2
move $t1, $t2 
move $t2, $t3

addi $t0, $t0, -1
j loop

end_Fib:
move $v0, $t3
sw $v0, result

lw $a0, 0($sp)
lw $ra, 4($sp)
addi $sp, $sp, 8
jr $ra






