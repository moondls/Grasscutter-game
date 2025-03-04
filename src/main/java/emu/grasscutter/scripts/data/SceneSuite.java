package emu.grasscutter.scripts.data;

import java.util.List;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class SceneSuite {
	public List<Integer> monsters;
	public List<Integer> gadgets;
	public List<String> triggers;
    public List<Integer> regions;
    public int rand_weight;

	public transient List<SceneMonster> sceneMonsters;
	public transient List<SceneGadget> sceneGadgets;
	public transient List<SceneTrigger> sceneTriggers;
    public transient List<SceneRegion> sceneRegions;

}
