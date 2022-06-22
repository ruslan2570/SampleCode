
namespace StorageAndBoxes
{
	internal class Program
	{
		public static void Main(String[] args)
		{
			Storage storage = new Storage();
			Box box1 = new Box(2, Forks);
			Box box2 = new Box(1, Milk);
			Box box3 = new Box(0, Nothing);
			storage.putBox(box1);
			storage.putBox(box2);
			storage.putBox(box3);
			storage.printBoxes();
			Console.WriteLine(box3.weight);
		}

	}

	class Storage
	{
		private string[] boxes = new string[10];
		private int index = 0;

		public void putBox(Box b) {
			boxes[index++] = b.contains;
			b.weight = 42;
		}

		public void printBoxes()
		{
			for (int i = 0; i  boxes.Length; i++)
			{
				if (boxes[i] == null) return;
				Console.WriteLine(boxes[i]);
			}
		}
	}
	class Box
	{
		public string contains;
		public int weight;

		public Box(int w, string cont) 
		{
			weight = w;
			contains = cont;
		}
	}
}
