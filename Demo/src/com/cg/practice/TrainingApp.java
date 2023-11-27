package com.cg.practice;
//polymorphism
public class TrainingApp 
{
public static void main(String[] args) 
{

JavaTrainer jt=new JavaTrainer();
train(jt);
AptiTrainer at=new AptiTrainer();
train(at);
TestingTrainer tt=new TestingTrainer();
train(tt);
}
static void train(Trainer t)
{
	t.teach();
}
}
class Trainer
{
	void teach()
	{
		System.out.println("A trainer teaches");
	}
}
class JavaTrainer extends Trainer
{
	void teach()
	{
		System.out.println("A java trainer teaches java");
	}
}
class AptiTrainer extends Trainer
{
	void teach()
	{
		System.out.println("An anpti trainer teaches aptitude");
	}
}
class TestingTrainer extends Trainer
{
	void teach()
	{
		System.out.println("A testing trainer teaches testing");
	}
}