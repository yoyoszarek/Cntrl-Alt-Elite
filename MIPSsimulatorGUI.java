import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MIPSsimulatorGUI extends JFrame {

    public MIPSsimulatorGUI() {
    	JPanel main = new JPanel();
        setTitle("MIPS Simulator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
       

        // Create buttons
        JButton machineStepButton = new JButton("Perform One Machine Step");
        JButton microcodeStepButton = new JButton("Perform One Microcode Step");
        JButton runFullSpeedButton = new JButton("Run Full Speed Until Halt Instruction");
        JButton editMemoryButton = new JButton("Edit a Value in Memory");
        JRadioButton switchDisplayRadio = new JRadioButton("Switch Display Format");
        JLabel cacheHitRateLabel = new JLabel("Cache Hit Rate: ");
        JButton setPCButton = new JButton("Set/Edit the PC Value");
        JButton clearCacheButton = new JButton("Clear Cache");
        JButton saveStateButton = new JButton("Save Machine State");
        JButton loadStateButton = new JButton("Load Machine State");

        // Add buttons to the frame
        add(machineStepButton);
        add(microcodeStepButton);
        add(runFullSpeedButton);
        add(editMemoryButton);
        add(switchDisplayRadio);
        add(cacheHitRateLabel);
        add(setPCButton);
        add(clearCacheButton);
        add(saveStateButton);
        add(loadStateButton);

        // Action listeners for buttons
        machineStepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform one machine step
            }
        });

        microcodeStepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform one microcode step
            }
        });

        runFullSpeedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Run full speed until halt instruction
            }
        });

        editMemoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Edit a value in memory
            }
        });

        switchDisplayRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch register, cache, and memory displays between binary, hex, and decimal
            }
        });

        setPCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set/edit the PC value
            }
        });

        clearCacheButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear cache
            }
        });

        saveStateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Save machine state
            }
        });

        loadStateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Load machine state
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MIPSsimulatorGUI();
    }
}
