import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AsidepartComponent } from './asidepart.component';

describe('AsidepartComponent', () => {
  let component: AsidepartComponent;
  let fixture: ComponentFixture<AsidepartComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AsidepartComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AsidepartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
